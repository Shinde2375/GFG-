//Count possible ways to construct buildings        05/01/2024(Friday)


public class Solution33 
{
    public int TotalWays(int N)
    {
        int mod = 1000000007;
       long[] dp = new long[N+1];
       
       dp[0] =1;
       dp[1] = 2;
      for(int i=2;i<=N;i++)
      
         
          dp[i] = (dp[i-1]+dp[i-2])%mod;
      
      return (int) ((dp[N]*dp[N])%mod);
      
    }
}
