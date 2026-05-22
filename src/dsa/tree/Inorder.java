package dsa.tree;
import java.util.ArrayList;

//Recursive Inorder Traversal

class Node{
    int data;
    Node right;
    Node left;
    Node(int item){
        data = item;
        left=right=null;
    }
}
public class Inorder {
    static void inOrder(Node node, ArrayList<Integer> res){
        if(node == null){
            return;
        }

        inOrder(node.left,res);

        res.add(node.data);

        inOrder(node.right,res);
    }
    public static void main(String[] args){
        // Create binary tree
        //       1
        //      /  \
        //    2     3
        //   / \     \
        //  4   5     6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        ArrayList<Integer> result = new ArrayList<>();
        inOrder(root, result);

        for(int node:result){
            System.out.print(node +" ");
        }
    }
}

//Time complexity => O(n)
//Space complexity => O(h) "h -> height of the tree"  or O(n) if skewed tree.
