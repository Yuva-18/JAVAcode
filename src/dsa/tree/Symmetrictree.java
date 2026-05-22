package dsa.tree;
import java.util.Stack;



public class Symmetrictree{
    // Recursive helper function to
    // check if two subtrees are mirror images
    static boolean isMirror(Node leftSub, Node rightSub) {

        if (leftSub == null && rightSub == null)
            return true;

        // One of them is null, so they aren't mirror images
        if (leftSub == null || rightSub == null
                || leftSub.data != rightSub.data)
            return false;

        // Check if the subtrees are mirrors
        return isMirror(leftSub.left, rightSub.right)
                && isMirror(leftSub.right, rightSub.left);
    }

    static boolean isSymmetric(Node root) {
        if (root == null)
            return true;

        return isMirror(root.left, root.right);
    }
    public static void main(String[] args){
        // Creating a sample symmetric binary tree
        //       10
        //       / \
        //      5   5
        //     /     \
        //    2       2
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.right.right = new Node(2);

        if (isSymmetric(root))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

class Stacksymmetric{
    static boolean isSymmetric(Node root){
        if(root == null){
            return true;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        // Initialize the stacks with the left
        // and right subtrees
        s1.push(root.left);
        s2.push(root.right);

        while (!s1.isEmpty() && !s2.isEmpty()) {

            // Get the current pair of nodes
            Node node1 = s1.pop();
            Node node2 = s2.pop();

            // If both nodes are null, continue to the next pair
            if (node1 == null && node2 == null) {
                continue;
            }

            if (node1 == null || node2 == null
                    || node1.data != node2.data) {
                return false;
            }

            // Push children of node1 and node2 in opposite order
            // Push left child of node1 and right child of node2
            s1.push(node1.left);
            s2.push(node2.right);

            // Push right child of node1 and left child of node2
            s1.push(node1.right);
            s2.push(node2.left);
        }

        return s1.isEmpty() && s2.isEmpty();
    }
    public static void main(String[] args){
        // Creating a sample symmetric binary tree
        //       10
        //       / \
        //      5   5
        //     /     \
        //    2       2
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.right.right = new Node(2);

        System.out.println(isSymmetric(root));
    }
}
