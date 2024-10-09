// Reach the Nth point              15/12/2023 (Friday);



public class Solution20 {
    
    public int nthPoint(int n)
    {
        if(n==1 || n==2)return n;
        int dp[] = new int[n+1];
        
        int mod = (int)1e9+7;
        
        dp[0] =1;dp[1]=1;dp[2]=2;
        
        for(int i=3;i<=n;i++)
        {
            dp[i] = (dp[i-1]%mod)+ (dp[i-2]%mod);
        }
        return dp[n]%mod;
        }

StringBuilder sb = new StringBuilder();
        String a = a.equals(sb)
}
