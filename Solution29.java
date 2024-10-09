//Winner of an election     30/12/2023(Saturday);

import java.util.Map;
import java.util.TreeMap;

public class Solution29 {

    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String[] ans = new String[2];
        int max = 0;
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String i: arr) 
            map.put(i, map.getOrDefault(i, 0)+1);
            
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() > max) {
                ans[0] = m.getKey();
                ans[1] = m.getValue().toString();
                max = m.getValue();
            }
        }
        
        return ans;
    }
}