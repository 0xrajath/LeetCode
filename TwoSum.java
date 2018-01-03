class Solution {
    public int[] twoSum(int[] nums, int target) {
        int range = nums.length;        
        int[] soln = new int[2];       
        
        for(int i = 0; i<range ; i++){
            for (int j = i+1; j<range ; j++){
                int sum = nums[i] + nums[j];
                if (target == sum ){
                    soln[0] = i;
                    soln[1] = j;
                }
            }
        }
        
        return soln;

    }
}