/* You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Note: Given n will be a positive integer.
 */


class Solution {   
    int[] lookup; //Using Lookup array to reduce Time Complexity to O(n) from O(2^n)
    
    public int climbStairs(int n) {
        lookup = new int[n+1]; 
        return evalClimbStairs(n);
    }
    
    
    private int evalClimbStairs(int n){
        if(n>0 && lookup[n] > 0) //Will not throw ArrayIndexOutofBounds Exception for -ve 'n' due to Boolean shortciruiting
            return lookup[n];
        else if(n==0)
            return 1;
        else if(n<0)
            return 0;
        else
            lookup[n] = evalClimbStairs(n-1) + evalClimbStairs(n-2);
            return lookup[n];    
    }
    
}