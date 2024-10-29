public class BinaryTreeNode {
    private int idNumber;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int idNumberIn) {
        this.idNumber = idNumberIn;
        this.left = null;
        this.right = null;
    }

    public void displayPreOrder(String indent) {
        
        System.out.println(indent + idNumber);
        if (left != null) {
            left.displayPreOrder(indent + "    ");
        }
        if (right != null) {
            right.displayPreOrder(indent + "    ");
        }
    }

    public void setIdNumber(int newIdNumber) {
        idNumber = newIdNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void insert(int newIdNumber) {
        if (newIdNumber == idNumber) {
            throw new IllegalArgumentException("Duplicate found: Number " + newIdNumber + " is already in the tree.");
        }

        if (newIdNumber < idNumber) {
            if (left == null) {
                left = new BinaryTreeNode(newIdNumber);
            } else {
                left.insert(newIdNumber);
            }
        } else {
            if (right == null) {
                right = new BinaryTreeNode(newIdNumber);
            } else {
                right.insert(newIdNumber);
            }
        }
    }
}
