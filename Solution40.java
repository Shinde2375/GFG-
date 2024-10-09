//Sequence of Sequence      16/01/2024(Tuesday);

public class Solution40 {
    static int numberSequence(int m, int n)
    {
        return helper(m,n);
    }
    static int helper(int m,int n)
    {
        if(m<n)return 0;
        if(n==0) return 1;
        return helper(m/2,n-1)+helper(m-1,n);
    }
}
