//Buy Maximum Stocks if i stocks can be bought on i-th day   (Sunday)24/12/2023


import java.util.ArrayList;
import java.util.Collections;

public class Solution27 {
      public static int buyMaximumProducts(int n, int k, int[] price){
        ArrayList<Pair> al = new ArrayList<>();
        for(int i =0;i<n;i++){
            al.add(new Pair(i+1,price[i]));
        }
        Collections.sort(al,(a,b)->{
            return a.price-b.price;
        });
        int ans = 0;
        for(Pair x : al){
            int p = x.price;
            int cnt = x.i;
            if(k<=0){
                break;
            }
            if(k>=cnt*p){
                ans += cnt;
                k -= cnt*p;
            }else{
                ans += k/p;
                k -= p*(k/p);
            }
        }
        return ans;
    }
}
class Pair{
    int i;
    int price;
    Pair(int i, int price){
        this.i  =i;
        this.price = price;
    }
    
}
