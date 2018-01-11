import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Iterative Solution using Stack;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> finalSoln = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        TreeNode curr = root;
        
        while(!st.empty() || curr!=null){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            
            curr = st.pop();
            finalSoln.add(curr.val);
            curr = curr.right;           
        }
        
        return finalSoln;
            
    }
}


//Recursive Solution
/* class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root!=null){           
            List<Integer> finalSoln = new ArrayList<Integer>();
            
            finalSoln.addAll(inorderTraversal(root.left));
            finalSoln.add(root.val);
            finalSoln.addAll(inorderTraversal(root.right));
            
            return finalSoln;  
        }else
            return new ArrayList();        
            
    }
} */