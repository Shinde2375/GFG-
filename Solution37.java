//Longest subarray with sum divisible by K`     10-01-2024(Wednusday);


public class Solution37 {
    

        int longSubarrWthSumDivByK(int a[], int n, int k) {
            int[] modArr = new int[k];
            int maxLength = 0;
            int prefixSum = 0;
    
            // Initialize modArr with -1 (an invalid index)
            for (int i = 0; i < k; i++) {
                modArr[i] = -1;
            }
    
            for (int i = 0; i < n; i++) {
                // Calculate the running prefix sum
                prefixSum += a[i];
    
                // Calculate the remainder when divided by K
                int modulus = ((prefixSum % k) + k) % k;
    
                // If prefixSum is divisible by K, update maxLength to current index + 1
                if (modulus == 0) {
                    maxLength = i + 1;
                } else {
                    // If remainder exists in modArr, update maxLength to the maximum of maxLength and the difference between current index and the stored index
                    if (modArr[modulus] != -1) {
                        maxLength = Math.max(maxLength, i - modArr[modulus]);
                    } else {
                        // Store the remainder and its index in modArr
                        modArr[modulus] = i;
                    }
                }
            }
    
            return maxLength;
        }
    }

