//post order traversal
//left  -> right -> root

class PostOrderTraversal {
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);               
        postOrder(root.right);             
        System.out.print(root.data + " ");  
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        PostOrderTraversal tree = new PostOrderTraversal();
        System.out.println("Post-order traversal of the tree:");
        tree.postOrder(root);
    }
}
