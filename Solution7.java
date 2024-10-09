import java.util.ArrayList;

class Solution7 {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
      int count=0;
       for(int i=0;i<V;i++)
       {
           count += adj.get(i).size(); 
       }
       return count;
    }
};