/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null ) return null;
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while(fast != null ){
            slow  = slow.next;
            fast = fast.next;
            if(fast == null) return null;
            fast = fast.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        
        if(!flag) return null;
        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
