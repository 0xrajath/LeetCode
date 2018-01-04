/* Given an array of integers, every element appears twice except for one. Find that single one.
Note: Your algorithm should have a linear runtime complexity. */

import java.util.*;

class Solution {
 
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> lookup = new HashMap<Integer,Integer>();
        int finalSoln=0;
        
        for(int i=0; i<nums.length;++i){
            if(lookup.get(nums[i]) == null)
                lookup.put(nums[i],nums[i]);
            else
                lookup.remove(nums[i]);
        }
        
        for(int j : lookup.values())
            finalSoln = j;
        
        return finalSoln;
    }
}