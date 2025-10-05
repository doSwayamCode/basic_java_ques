//pre order traversal
//root -> left -> right

class Node{
    int data;
    Node left, right;

    Node(int item){
        data = item;
        left = right = null;
    }
}
//main code
class PreOrderTraversal {
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); 
        preOrder(root.left);                 
        preOrder(root.right);                
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        PreOrderTraversal tree = new PreOrderTraversal();
        System.out.println("Pre-order traversal of the tree:");
        tree.preOrder(root);
    }
}
