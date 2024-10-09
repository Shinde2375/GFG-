//Transform to prime    

class Solution15
{
    
    public int minNumber(int arr[], int N)
    {
        int total = 0;

        for(int i=0;i<N;i++)
        {
            
            total += arr[i];
        }
        
        if(total <=1)
        {
            return 0;
        }
  
        
        int i=1;  int ans = total;
        while(!isPrime(ans))
        {
             i++;
            ans=total+i;
           
        }
        return i;
        
    }
    
    public boolean isPrime(int n)
    {
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
            //   break;
           }  
       }  
       return true;  
   }  
}
