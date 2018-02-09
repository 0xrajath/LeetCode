/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)//Empty scenario
            return head;       
        
        ListNode prev;
        ListNode current = head;       
        ListNode next = head.next;
        head.next = null;
        
        while(next != null){
            prev = current;
            current = next;
            next = next.next;
            current.next = prev;           
        }
        
        return current;
        
    }
}