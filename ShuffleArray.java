/* 
Shuffle a set of numbers without duplicates.

// Init an array with set 1, 2, and 3.
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
solution.shuffle();

// Resets the array back to its original configuration [1,2,3].
solution.reset();

// Returns the random shuffling of array [1,2,3].
solution.shuffle(); 
*/

class Solution {
    
        int[] array;
        int[] original;
        
        public Solution(int[] nums) {
            array = nums;
            original = nums.clone(); //Creates an entirely new array not referenced by nums      
        }
        
        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return original;
        }
        
        /** Returns a random shuffling of the array. */
        //Fisher-Yates Algorithm
        public int[] shuffle() {
            Random r = new Random();
            
            for(int i = array.length-1; i>=0 ; --i){
                int index = r.nextInt(i+1);
                if(index!=i){
                    int temp = array[index];
                    array[index] = array[i];
                    array[i] = temp;
                }            
            }
            
            return array;              
        }
    }
    
    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(nums);
     * int[] param_1 = obj.reset();
     * int[] param_2 = obj.shuffle();
     */