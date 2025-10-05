//in order traversal
//left -> root -> right
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

//main code
class InOrderTraversal {
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);         
        System.out.print(root.val + " "); 
        inOrder(root.right);          
    }

    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InOrderTraversal tree = new InOrderTraversal();
        System.out.println("In-order traversal of the tree:");
        tree.inOrder(root); 
    }
}
