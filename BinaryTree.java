public class BinaryTree {
   BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int idNumber){
        if (root == null) {
            root = new BinaryTreeNode(idNumber);
        } else {
            root.insert(idNumber);
        }
    }

    public void displayPreOrder() {
        System.out.println("***** Begin preorder display *****");
        if (root != null) {
            root.displayPreOrder("");
        }
        System.out.println("******* End preorder display ********");
    }
}
