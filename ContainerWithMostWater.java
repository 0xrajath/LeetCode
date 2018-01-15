/* 
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2. 
*/


/* 
//Brute Force Solution
import java.lang.Math;

class Solution {
    public int maxArea(int[] height) {
        
        int mArea=0;
        
        for(int i=0; i< height.length; ++i){
            for(int j=i+1; j<height.length;++j){
                int h = Math.min(height[i],height[j]);
                int b = j-i;
                
                mArea = Math.max(mArea, h * b);
            }      
        }
        
        return mArea;       
    }
} 
*/


//Two Pointer Solution
import java.lang.Math;

class Solution {
    public int maxArea(int[] height) {
        
        int mArea=0;
        int start=0;
        int end= height.length-1;
        
        while(start<end){
            mArea=Math.max(mArea, Math.min(height[start],height[end])*(end-start));
            
            if(height[start]<height[end])
                start++;
            else
                end--;         
        }
        
        return mArea;       
    }
}