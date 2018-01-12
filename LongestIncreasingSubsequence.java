import java.lang.Math;

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