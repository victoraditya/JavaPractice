package BinaryTree;

class Node {
    int data;
    Node left, right;

    public Node(int key) {
        this.data = key;
        left = right = null;
    }
}

public class BinaryTree {

    Node node;

    BinaryTree() {
        node = null;
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.node = new Node(1);
        binaryTree.node.left = new Node(2);
        binaryTree.node.right = new Node(3);
        binaryTree.node.left.left = new Node(4);
        binaryTree.node.left.right = new Node(5);
        System.out.println("-----preorder----------");
        binaryTree.printpreorder(binaryTree.node);
        System.out.println("-----inorder----------");
        binaryTree.printinorder(binaryTree.node);
        System.out.println("-----postorder----------");
        binaryTree.printpostorder(binaryTree.node);
        System.out.println("Is tree BST?" + isBst(node));
    }

    private static boolean isBst(Nod binaryTree) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        isBstUtil(binaryTree, min, max);
        if (binaryTree == null) {
            return true;
        }
    }

    private static boolean isBstUtil(Node node, int min, int max) {

        if (node == null) return true;

        if (node.data < min || node.data > max) return false;

        return (isBstUtil(node.left, min, node.data - 1) && isBstUtil(node.right,node.data+1,max));


    }

    private void printpostorder(Node node) {

        if (node == null) {
            return;
        }

        printpostorder(node.left);
        printpostorder(node.right);
        System.out.println(node.data);

    }

    private void printinorder(Node node) {
        if (node == null) {
            return;
        }

        printinorder(node.left);
        System.out.println(node.data);
        printinorder(node.right);
    }

    private void printpreorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);
        printpreorder(node.left);
        printpreorder(node.right);
    }

}

