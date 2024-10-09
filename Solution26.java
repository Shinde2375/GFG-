//1Count More than n/k Occurences   23/12/2023(Saturday);


class Solution 
{
    
    public int countOccurence(int[] arr, int n, int k) 
    {

        HashMap<Integer,Integer> m= new HashMap<>();
        for(int i:arr) m.put(i,m.getOrDefault(i,0)+1);
        int l=n/k;
        int c=0;
        for(int i:m.values())if(i>l) c++;
        
        return c;
    }
}