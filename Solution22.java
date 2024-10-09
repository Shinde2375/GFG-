//Game of XOR (18/12/2023 )(Monday)

public class Solution22 {
   
        static int gameOfXor(int n , int[] a) {
            
            int[] ans = new int[n];
             ans[0] = n-1;
            int xor = a[0];
            for(int i = 1;i<n;i++){           
                ans[i] = ans[i-1]+(n-1-i)-(i-1);
                xor=xor^a[i];
            }
            for(int i = 0;i<n;i++){
                if(ans[i]%2!=0){
                    xor=xor^a[i];
                }
            }
            return xor;
            
        }
        }
