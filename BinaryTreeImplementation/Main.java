import java.util.*;

public class Main{
    public static void main(String args[]){
        binaryTree tree = new binaryTree();

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number of nodes to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values:");

        for(int i = 0 ; i < n ; i++){
            int val = sc.nextInt();

            tree.root = tree.insert(tree.root , val);
        }


        System.out.println("Inorder Traversal: ");
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        


        System.out.println("\nPreOrder Traversal: ");
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("\nPostOrder Traversal:  ");
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();

    }
}