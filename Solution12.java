public class Solution12 {

    int getMinDiff(int[] arr, int n, int k) {

        int max =0;
        int min =0;
              for(int i=1;i<n;i++)
              {
                max = Math.max(arr[i-1]+k,arr[n-1]+k);
                min = Math.min(arr[0]+k, arr[i]=k)
              }
              ans = Math.min(ans,max)
    }
}
