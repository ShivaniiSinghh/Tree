class ExtendBinaryNode<T>{ //T is used for type safety and flexibility of code
    T data;
    ExtendBinaryNode<T> left;
    ExtendBinaryNode<T> right;

    public ExtendBinaryNode(T data){
        this.data = data;
        //No need to specify BinaryNode left and right to be null because by default instance variable are null
    }
}
public class ExtendBinaryTree {
    public static void main(String[] args) {
        ExtendBinaryNode<Integer> root = new ExtendBinaryNode<>(15);
        ExtendBinaryNode<Integer> Rleft = new ExtendBinaryNode<>(16);//Rleft = left of root
        ExtendBinaryNode<Integer> Rright = new ExtendBinaryNode<>(20);//Rright = right of root
        ExtendBinaryNode<Integer> Rleftright = new ExtendBinaryNode<>(18);
        ExtendBinaryNode<Integer> Rrightleft = new ExtendBinaryNode<>(60);
        root.left = Rleft;//For attachment/linking
        root.right=Rright;//For attachment/linking
        root.left.right = Rleftright;
        root.right.left = Rrightleft;

        print(root);
    }
    public static void print(ExtendBinaryNode root){
        //To avoid NullPointerException
        if(root==null) {
            return;
        }
        System.out.print( root.data + "->" +" ");
        if(root.left!=null) {
            System.out.print(" "+"L" + root.left.data +" ") ;
        }
        if(root.right!=null) {
            System.out.print(" "+"R" + root.right.data+ " ");
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }
}
