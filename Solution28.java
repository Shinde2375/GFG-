//Check if a string is repetition of its substring of k-length      (Friday)29/12/2023


import java.util.HashMap;

public class Solution28 {
    int kSubstrConcat(int n, String s, int k)
    {
        if(n%k!=0){
            return 0;
        }
      
        HashMap<String,Integer> h=new HashMap<>();
        String g=s.substring(0,k);
        int i=0;
     while(i<n){
         String ku=s.substring(i,i+k);
        h.put(ku,h.getOrDefault(ku,0)+1);
       
        i+=k;
     }   
        if(h.size()>2){
            return 0;
        }
        
  int m=h.get(g);
  if(m==1||m==n/k||m==(n/k)-1){
      return 1;
  }
        
        
     return 0;
    }
}
