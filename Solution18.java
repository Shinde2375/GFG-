
//  Gold Mine Problem "https://www.geeksforgeeks.org/problems/gold-mine-problem2608/1"      12/12/2001(Tuesday);

public class Solution18 {
    static int maxGold(int n, int m, int M[][])
    {
        int ans=0;
        for(int j=1;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
                int mx = 0;
                if(i-1>=0 && j-1>=0)
                mx = Math.max(mx,M[i-1][j-1]);
                
                if(j-1>=0)
                mx = Math.max(mx,M[i][j-1]);
                
                if(i+1<n && j-1>=0)
                mx = Math.max(mx,M[i+1][j-1]);
                M[i][j] += mx;
                ans = Math.max(ans,M[i][j]);
            }
        }
    return ans;
    }
}
