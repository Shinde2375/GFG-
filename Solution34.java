//Techfest and the Queue            06/01/2024(Saturday);


public class Solution34 {
    
    public static long sumOfPowers(long a,long b)
    {
        long sum =0;
        for(long i=a;i<=b;i++)
        {
            sum += pf(i);
        }
        return sum;
    }
    public static long pf(long n)
    {
        long count =0;

        while(n%2 ==0)
        {
            count++;
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n); i+=2)
        {
            while(n%i==0)
            {
                count++;
                n/=i;
            }
        }
    

    if(n>2)
    count++;
    return count;
}
}