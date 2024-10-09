//Subarray with 0 sum

import java.util.HashSet;

public class Solution17{

    static boolean findsum(int arr[],int n)
   {
       HashSet<Integer> h=new HashSet<>();
       //Your code here
       int sum=0;
       for(int i:arr){
           sum+=i;
           if(h.contains(sum)||sum==0) return true;
           h.add(sum);
       }
       return false;
   }
}


