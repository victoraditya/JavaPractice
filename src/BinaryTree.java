
class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key = key;
        left=right=null;
    }
}

public class BinaryTree {

    Node root;
    BinaryTree(){
        root=null;
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left=new Node(2);
        binaryTree.root.right=new Node(3);
        binaryTree.root.left.left=new Node(4);
        binaryTree.root.left.right=new Node(5);
        System.out.println("-----preorder----------");
        binaryTree.printpreorder(binaryTree.root);
        System.out.println("-----inorder----------");
        binaryTree.printinorder(binaryTree.root);
        System.out.println("-----postorder----------");
        binaryTree.printpostorder(binaryTree.root);
    }

    private void printpostorder(Node node) {

        if(node==null){
            return;
        }

        printpostorder(node.left);
        printpostorder(node.right);
        System.out.println(node.key);

    }

    private void printinorder(Node node) {
        if(node==null){
            return;
        }

        printinorder(node.left);
        System.out.println(node.key);
        printinorder(node.right);
    }

    private void printpreorder(Node node) {
        if(node==null){
            return;
        }

        System.out.println(node.key);
        printpreorder(node.left);
        printpreorder(node.right);
    }

}

