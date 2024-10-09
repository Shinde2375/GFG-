//                                                      09/01/2024(Tuesday);

import org.w3c.dom.Node;

public class Solution36 {
    
    
   static class Node{
    int data;
    Node left;
    Node right;

        Node(int data)
        {
            this.data = data;
        }
    }
    static Node insert(Node root,int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return root;
        }

        if(root.data > data)
        {
          root.left =  insert(root.left, data);
        }
        else{
            root.right = insert(root.right,data);
        }
        return root;

    }

    public static inorder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        inorder(root.left)
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] data = {3,4,9,15,7,6,1,2};
        Node root=null;

        for(int i=0;i<data.length;i++)
        {
            root = insert(root,data[i]);

        }
        inorder(root);
        System.out.println();
    }
}



