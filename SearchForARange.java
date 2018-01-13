/* 
Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4]. 
*/

//O(logn) Solution
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left = searchIndex(nums,target,0,nums.length-1, true); 
        int right = searchIndex(nums,target,0,nums.length-1, false); 
         
        return new int[] {left,right};
        
    }
    
    public int searchIndex(int[] nums, int target, int startIndex, int endIndex, boolean searchLeft ){
        
        if(startIndex==endIndex && nums[startIndex]==target)
            return startIndex;
        else if(endIndex<startIndex)
            return -1;
        
        int mid = (startIndex+endIndex)/2;
        
        if(target>nums[mid])
            return searchIndex(nums, target, mid+1, endIndex, searchLeft);
        else if(target<nums[mid])
            return searchIndex(nums, target, startIndex, mid-1, searchLeft);
        else{ //target == num[mid]
            if(searchLeft){ 
                if(mid==0 || (mid!=0 && nums[mid-1]!=target))
                    return mid;
                else //Continue searching left
                    return searchIndex(nums, target, startIndex, mid-1, searchLeft);
            }else{ 
                if(mid==nums.length-1 || (mid!=nums.length-1 && nums[mid+1]!=target))
                    return mid;
                else //Continue searching right
                    return searchIndex(nums, target, mid+1, endIndex, searchLeft);
            }
               
             
        }      
        
    }
}