//Array Pair Sum Divisibility Problem       01/01/2024(Monday)

import java.util.HashSet;

public class Solution31 {
    
        public boolean canPair(int[] nums, int k) {
            if (nums.length % 2 != 0) {
                return false;
            }
    
            // Use a HashSet to store remainders
            HashSet<Integer> remainders = new HashSet<>();
    
            for (int num : nums) {
                int remainder = (num % k + k) % k;  // Ensure remainder is non-negative
                int complement = (k - remainder) % k;
    
                // Check if the complement (required to make the sum divisible by k) is present
                if (remainders.contains(complement)) {
                    remainders.remove(complement);  // Remove the complement to avoid duplicate pairs
                } else {
                    remainders.add(remainder);
                }
            }
    
            // If the HashSet is empty, all pairs are found
            return remainders.isEmpty();
        }
}