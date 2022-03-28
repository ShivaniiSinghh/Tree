//Ordinary Binary Tree Representation with Generics

class BinaryNode<T>{ //T is used for type safety and flexibility of code
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T data){
        this.data = data;
        //No need to specify BinaryNode left and right to be null because by default instance variable are null
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        BinaryNode<Integer> root = new BinaryNode<>(15);
        BinaryNode<Integer> Rleft = new BinaryNode<>(10);//Rleft = left of root
        BinaryNode<Integer> Rright = new BinaryNode<>(20);//Rright = right of root
        root.left = Rleft;//For attachment/linking
        root.right=Rright;//For attachment/linking

        print(root);
    }
    public static void print(BinaryNode root){
        //To avoid NullPointerException
        if(root==null) {
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
