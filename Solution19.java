//Consecutive 1's not allowed       13/12/2023(Wednusday);


public class Solution19 {
   long countStrings(int n) {
        // code here
        long dp[] = new long[n+1];
        dp[0] = 1; dp[1] = 2; 
        
        if(n > 1){
            for(int i=2; i<=n; i++){
                long z = dp[i-1];
                long o = dp[i-2];
                dp[i] = (z+o)%(long)(1e9+7);
            }
        }
        
        
        return dp[n];
        
   }
}
