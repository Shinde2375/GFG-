
import java.util.HashMap;

public class Solution41 {
    public int maxDistance(int[] arr) {
        int n = arr.length;
       int ans=0;
        
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int i=0;i<n;i++)
       {
           if(map.containsKey(arr[i])){
               ans=Math.max(ans,i-map.get(arr[i]));
           }
           else{
               map.put(arr[i],i);
           }
       }
       return ans;
     }
}
