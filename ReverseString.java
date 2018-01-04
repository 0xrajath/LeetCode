/* First Attempt which works

class Solution {
    public String reverseString(String s) {
        String finalSoln = "";
        
        for(int i=s.length()-1; i>=0 ;--i){
            finalSoln = finalSoln + Character.toString(s.charAt(i));         
        }
        
        return finalSoln;
        
    }
} */

import java.lang.*;

class Solution {
    public String reverseString(String s) {
       
       StringBuilder sB = new StringBuilder();
       
       sB.append(s);
       sB = sB.reverse();
       
       return sB.toString();
        
    }
}