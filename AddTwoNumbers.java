/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode soln = new ListNode(0);
        ListNode curr = soln;
        
        int sum = 0;
        int carry = 0;
        //int counter1 =0;
        //int counter2 =0;
        
        
        while (temp1 != null || temp2 != null){
            
            int x = (temp1 != null)? temp1.val : 0;
            int y = (temp2 != null)? temp2.val : 0;
            
            sum = x + y + carry;
            carry = sum/10;
            sum = sum % 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
            
            if(temp1 != null){
                temp1 = temp1.next;
                //counter1++;
            }
                        
            if(temp2 != null){
                temp2 = temp2.next;
                //counter2++;
            }
            
            
        }
        
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        
       return soln.next;
      
        
    }
}