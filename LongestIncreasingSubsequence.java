/* 
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. 
Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity. 
*/

import java.lang.Math;

//DP Solution
class Solution {
    HashMap<Integer,Integer> lookup = new HashMap<Integer,Integer>();
    
    public int lengthOfLIS(int[] nums) {        
        int finalSoln = 0;
        for(int i=0; i<nums.length; ++i){
            finalSoln = Math.max(finalSoln, lengthLIS(nums,i));
        }      
        return finalSoln;
    }
    
    
    public int lengthLIS(int[] nums, int startIndex){
        if(startIndex == nums.length)
            return 0;
        else if(lookup.containsKey(startIndex))
            return lookup.get(startIndex);           
        else{
            int greatestLength = 0;
            
            for(int j=startIndex+1; j<nums.length; ++j){
                if(nums[j]>nums[startIndex]){
                    greatestLength = Math.max(greatestLength, lengthLIS(nums,j));                     
                }                                
            }
            
            lookup.put(startIndex, 1+greatestLength);
            return 1 + greatestLength;        
            
        }     
        
    }
}