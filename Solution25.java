
//Maximum Meetings in One Room      Friday (22/12/2023)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution25 {
     static class Pair{
        int s;
        int f;
        int ind;
        Pair(int s,int f,int ind){
            this.s=s;
            this.f=f;
            this.ind=ind;
        }
       
    }
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        List<Pair> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(new Pair(S[i],F[i],i+1));
        }
        Collections.sort(list,(a,b)->a.f-b.f);
        ArrayList<Integer> ans=new ArrayList<>();
        int last=-1;
        for(int i=0;i<N;i++){
            if(list.get(i).s>last){
                ans.add(list.get(i).ind);
                last=list.get(i).f;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
