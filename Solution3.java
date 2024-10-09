// Determine if Two Trees are Identical

import java.util.ArrayList;

import org.w3c.dom.Node;

class Solution3
 
{   
    ArrayList<Integer> hasA = new ArrayList<>();
    ArrayList<Integer> hasB = new ArrayList<>();
    
    void recur(Node root, ArrayList<Integer> has){
        if(root==null){
            return;
        }
        
        
            has.add(root.data);
            recur(root.left,has);
            recur(root.right,has);
        
        
    }
    boolean isIdentical(Node root1, Node root2)
    {
        
      recur(root1,hasA);
      recur(root2,hasB);
      
      return hasA.equals(hasB);
        
        
    }
 
}
