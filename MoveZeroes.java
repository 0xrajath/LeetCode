//Move all zeros to end of array while maintaining relative order of non-zero elements.
//Should be done in place.

class Solution {
    public void moveZeroes(int[] nums) {
        
        //O(n^2) Solution by bubbling up the 0s to the end
        for(int i= nums.length-1 ; i>=0; --i){
            if(nums[i]==0){
                for(int j=i+1 ; j<nums.length ; ++j){
                    if(nums[j] != 0){
                        int temp = nums[j]; //Bubbling up the 0
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                    }else{
                        break;
                    }
                }
            }                        
        }
              
        
    }
}