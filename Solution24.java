//Modified Game of Nim      20/12/2023 (Wednusday)


public class Solution24 {
    
    static int findWnner(int n,int A[])
    {
        int val=0;
        if(n%2 ==0)
        {
            retun 1;
        }
        for(int x:A)
        {
            val = val^x;

        }
        if(val ==0)
        {
            return 1;
        }
        return 2;
    }
}

