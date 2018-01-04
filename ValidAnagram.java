import java.lang.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        StringBuilder sB = new StringBuilder(t);       
        
        //Greedy approach
        for(int i=0; i<s.length(); ++i){
            for(int j=0; j<sB.length(); ++j){
                if(s.charAt(i) == sB.charAt(j)){
                    sB.deleteCharAt(j);
                    break; //To break if one character detected
                }
            }
        }
        
        if(sB.length() == 0)
            return true;
        else
            return false;
        
    }
}