public class binaryTree {

    public Node root;

    public Node insert(Node node , int data){
        if (node == null) {
            return new Node(data);
        }

        if(data < node.data){
            node.left = insert(node.left, data);
        }

        else if(data > node.data){
            node.right = insert(node.right, data);
        }


        return node;
    }

// Left, Root, Right values will be printed 
    public void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);

        }
    }
    //ROOT , LEFT , RIGHT - PREORDER

    public void preorder(Node node){
        if(node != null){
            
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);

        }
    }

    // LEFT, RIGHT ROOT - POSTORDER

    public void postorder(Node node){
        if(node != null){
            
            
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");

        }
    }

    
}
