/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        
        while(head != null && head.val == val)  {
            head = head.next;
        }
        
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null)  {
            if(cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            } else  {
                prev = cur;
                cur = cur.next;
            }
            
        }
        
        return head;
        
    }
}