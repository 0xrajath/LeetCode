/* 
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode finalSoln = null;
        
        //Base Case
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        
        if(l1.val <= l2.val){
            finalSoln = l1;
            finalSoln.next = mergeTwoLists(l1.next,l2);         
        }else{
            finalSoln = l2;
            finalSoln.next = mergeTwoLists(l1, l2.next);
        }
        
        return finalSoln;
    }
}