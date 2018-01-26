/* 
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
 
Example:
Input: "cbbd"
Output: "bb" 
*/


//O(n^3) Solution - Brute Force
import java.lang.*;

class Solution {
    public String longestPalindrome(String s) {
        String finalSoln="";
        
        for(int i=0; i<s.length(); ++i){
            for(int j=i; j<s.length(); ++j){
                if(isPalindrome(s.substring(i,j+1))){
                    if(j-i+1 > finalSoln.length())
                        finalSoln = s.substring(i,j+1);
                }
                    
            }         
        }
        
        return finalSoln;
    }
    
    public boolean isPalindrome(String s){
        StringBuilder sB = new StringBuilder(s);
        sB = sB.reverse();
        
        if(s.equals(sB.toString()))
            return true;
        return false;
    }
}