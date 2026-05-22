package dsa.tree;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeInorder {
    static ArrayList<Integer> iterativeInOrder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node cur = root;

        while(cur != null || !st.isEmpty()){
            while(cur != null){
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            ans.add(cur.data);

            cur = cur.right;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Constructed binary tree is
        //          1
        //        /   \
        //      2      3
        //    /  \
        //  4     5

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> res = iterativeInOrder(root);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
