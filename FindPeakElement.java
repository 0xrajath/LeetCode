
/* 
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */

// Solution in O(logn) using modified binary search
class Solution {
    public int findPeakElement(int[] nums) {     
        return peakElement(nums, 0, nums.length-1);
    }
        
    public int peakElement(int[] nums, int startIndex, int endIndex){
        
        if(startIndex==endIndex)
            return startIndex;
        
        int mid = (startIndex + endIndex)/2;
        if(nums[mid]>nums[mid+1])
            return peakElement(nums, startIndex, mid);
        
        return peakElement(nums, mid+1, endIndex);       
        
    }
}