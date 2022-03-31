//Creation, Searching, Deletion, Traversal in Binary Tree using ARRAY.
import java.util.Scanner;

public class SearchDeleteBTuser {
    int arr[];
    int lastUSedIndex;
    int i;

    public SearchDeleteBTuser(int size){
        arr = new int[size-1];
        lastUSedIndex = 0;
    }

    public void Insert(int value)
    {
        if(lastUSedIndex > arr.length-1)
        {
            return;
        }
        arr[lastUSedIndex + 1]=value;
        lastUSedIndex++;
    }

    public int Search(int value){
        for(i=1;i<arr.length-1;i++) {
            if (arr[i] == value)
            {
                System.out.println("At index - "+i);
                return i;
            }
        }
        System.out.println(-1);
        return i;
    }

    public void Delete(int value){
        int res = Search(value);
        arr[res]=arr[lastUSedIndex];
        lastUSedIndex--;
    }

    public void PreOrderTraversal(int index)
    {
        if(index > lastUSedIndex)
            return;
        System.out.println(arr[index]);
        PreOrderTraversal(2*index);
        PreOrderTraversal(2*index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        SearchDeleteBTuser obj = new SearchDeleteBTuser(size);
        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
        obj.Insert(40);
        obj.Insert(50);
        obj.Insert(60);
        obj.Insert(70);
        obj.PreOrderTraversal(1);
        System.out.println("Enter the value to be searched :");
        obj.Search(sc.nextInt());


        System.out.println("Enter the value to be deleted :");
        obj.Delete(sc.nextInt());

        obj.PreOrderTraversal(1);

    }
}