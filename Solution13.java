//How Many X's?           06/12/2023        (Wednusday)

public class Solution13 {
    int countX(int L, int R, int X) {
        int count=0;
        
                for(int i=L+1;i<R;i++)
                {
                    int temp=i;
                    int rem=0;
                    while(temp > 0)
                    {
                    rem = temp %10 ;
                    if(X== rem)
                    {
                        count++;
                    }
                    temp = temp/10;
                    }
                }
                return count;
            }
}
