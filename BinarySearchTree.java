import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
public class BinarySearchTree {
    public static Node insert(Node root, Node newnode) {
        if (root == null) {
            root = newnode;
            return root;
        }
        if (root.data > newnode.data) {
            if (root.left == null)
                root.left = newnode;
            else {
                insert(root.left, newnode);
            }
        }
        if (root.data < newnode.data) {
            if (root.right == null)
                root.right = newnode;
            else
                insert(root.right, newnode);
        }
        return root;
    }
    public static void MinMax(Node root){
        System.out.println("Maximum on Left Subtree : " + root.left.data);
        System.out.println("Minimum on Right Subtree : " + root.right.data);
    }
    public static boolean Search(Node root,int value){
        boolean result;
        if(root==null)
            return false;
        if(root.data==value)
            return true;
        if(root.data>value)
            result=Search(root.left,value);
        else
            result=Search(root.right,value);
        return result;
    }
    public static void InBetween(Node root){
        if(root==null)
            return;
        if(root.data>10 && root.data<50)
            System.out.print(root.data+" ");
        InBetween(root.left);
        InBetween(root.right);
    }
    public static void PreOrderTraversal(Node root){
        if (root == null)
            return;
        System.out.print(root.data+" ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }
    public static void InOrderTraversal(Node root) {
        if (root == null)
            return;
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);
    }
    public static void PostOrderTraversal(Node root) {
        if (root == null)
            return;
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(15);
        insert(null,root);
        Node n1 = new Node(20);
        Node n2 = new Node(22);
        Node n3 = new Node(8);
        Node n4 = new Node(10);
        Node n5 = new Node(22);
        Node n6 = new Node(21);
        Node n7 = new Node(6);
        insert(root,n1);
        insert(root,n2);
        insert(root,n3);
        insert(root,n4);
        insert(root,n5);
        insert(root,n6);
        insert(root,n7);
        MinMax(root);
        System.out.println("Enter values to be searched : ");
        System.out.print(Search(root,sc.nextInt())+" "+"\n");
        System.out.println("Values in Between 10 and 50 : ");
        InBetween(root);
        System.out.println("\nPre Order Traversal : ");
        PreOrderTraversal(root);
        System.out.println("\nIn Order Traversal : ");
        InOrderTraversal(root);
        System.out.println("\nPost Order Traversal : ");
        PostOrderTraversal(root);
    }
}
