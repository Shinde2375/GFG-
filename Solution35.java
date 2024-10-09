//Merge 2 sorted linked list in reverse order       08/01/2024(Monday);

import java.util.ArrayList;
import java.util.Collections;

import org.w3c.dom.Node;

public class Solution35 {
    Node mergeResult(Node node1, Node node2)
    {
        if(node1 == null && node2 ==null)
        {
            return null;
        }
        ArrayList<Integer>arr = new ArrayList<>();
        
        while(node1 != null)
        {
            arr.add(node1.data);
        node1 = node1.next;
    }
    while(node2 != null)
    {
        arr.add(node2.data);
        node2 = node2.next;
    }
    
    Collections.sort(arr);
    int n = arr.size();
    
    Node head = new Node(arr.get(n-1));
    Node temp = head;
    
    for(int i=n-2;i>=0;i--)
    {
        temp.next = new Node(arr.get(i));
        temp = temp.next;
    }
    return head;
}
}
