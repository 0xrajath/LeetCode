//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

import java.lang.*;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sB = new StringBuilder();
        
        //Removing everything else apart from alphanumeric characters and making all characters lowercase
        for(int i=0; i<s.length(); ++i){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                sB.append((Character.toString(s.charAt(i))).toLowerCase());
            }
        }
               
        String sFinal = sB.toString();
        String sFinalReverse = sB.reverse().toString();
                
        if(sFinal.equals(sFinalReverse))
            return true;
        
        return false;
          
    }
}