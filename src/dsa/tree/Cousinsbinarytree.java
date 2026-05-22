package dsa.tree;

public class Cousinsbinarytree {
    static boolean isSiblings(Node root, int a, int b){
        if(root == null){
            return false;

        }
        if(root.left != null && root.right != null
                && root.left.data == a && root.right.data == b){
            return true;
        }
        if(root.left != null && root.right != null
                && root.left.data == b && root.right.data == a){
            return true;
        }
        return isSiblings(root.left,a,b) || isSiblings(root.right,a,b);
    }
    static int level(Node root, int value, int lev){
        if(root == null){
            return 0;
        }
        if(root.data == value){
            return lev;
        }
        int l = level(root.left,value,lev+1);
        if(l != 0){
            return l;
        }
        return level(root.right,value,lev+1);
    }
    static boolean isCousions(Node root, int a, int b){
        if(root == null){
            return false;
        }
        int aLevel = level(root,a,1);
        int bLevel = level(root,b,1);

        if(aLevel == 0 || bLevel == 0){
            return false;
        }

        return aLevel == bLevel && !isSiblings(root,a,b);
    }
    public static void main(String[] args){
        // create hard coded tree
        //       1
        //     /   \
        //    2     3
        //   /       \
        //  5         4

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.right.right = new Node(4);

        int a = 4,b = 5;
        if(isCousions(root,a,b)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
