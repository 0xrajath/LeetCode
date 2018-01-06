import java.lang.Math;

class Solution {
    public boolean isPowerOfThree(int n) {        
        double epsilon = 0.000001;
        if((Math.log(n)/Math.log(3) + epsilon) % 1 <= 2*epsilon) // Epsilon to handle the precision inaccuracies in division
            return true;
        
        return false;
    }
}