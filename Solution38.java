//Remove K Digits                       11/01/2024(Thursday);



import java.util.Stack;
public class Solution38 {
    public String removeKdigits(String str, int k) {
       Stack<Character> st=new Stack<>();
	   int n=str.length();
	   
	   for(int i=0;i<n;i++) {
		   char c=str.charAt(i);
		   while(!st.isEmpty() && st.peek()>c && k>0) {
			   st.pop();
			   k--;
		   }
		   
		   if(!st.isEmpty() || c!='0') 
			   st.push(c);
	   }	   
	   
	   
	   while(!st.isEmpty() && k>0) {
		   st.pop();
		   k--;
	   }   	  
	   
	   if(st.size()==0)return "0";  
	   
	   StringBuilder ans=new StringBuilder();
	   for(char chr: st) 
		   ans.append(chr);
	   
	  return ans.toString();
    }
}

