import java.util.*;
import java.lang.*;

class Solution {
    public int reverse(int x) {
        
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
            return 0;
        }
        
        List<Integer> tempStorage = new ArrayList<Integer>();
        int dividend = x;
        int remainder;
        int finalSoln = 0;
        
        while(dividend != 0){
            remainder = dividend % 10;
            tempStorage.add(remainder);
            dividend = dividend - remainder;
            if(dividend !=0){
                dividend = dividend/10;
            }                        
        }
        
        int index = tempStorage.size() - 1;
        int power = 1;
        
        for(int i = index; i >= 0 ; --i){
            finalSoln = finalSoln + (tempStorage.get(i))*power;
            power = power * 10;
        }
        
        
        
        return finalSoln;
        
    }
}