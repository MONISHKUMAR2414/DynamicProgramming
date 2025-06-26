import java.util.*;
class MyStack{

    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor
    public MyStack(int n) {
        this.maxSize = n;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }


    public boolean isFull(){
        return (top == maxSize-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(int value){
        if(isFull()){
            System.out.println("StackOverFlow!!!!!");
        }
        else{
            stackArray[++top] = value;
            System.out.println("Value is Pushed SuccessFully BuddYYY!!!");
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Under Flow!!!!!");
        }

        else{
            int ele = stackArray[top--];
            System.out.println("Poped Element is = "+ ele);
        }
    }


    public void display(){
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("The Stack is Empty!!");
        }

        else{
            System.out.println("Top of the stack: " + stackArray[top]);
        }
    }



}


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Stack");

        int n = sc.nextInt();

        MyStack stack = new MyStack(n);

        while(true){
            System.out.println("Select the Operation Based on it:");

            System.out.println("1.push\n 2.Pop\n 3.peek\n 4.Display \n 5.exit");

            System.out.println("Enter the Choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case 2:
                    stack.pop();

                case 3: 
                    stack.peek();

                case 4: 
                    stack.display();
                
                case 5:
                System.out.println("Exiting");
                sc.close();
                return;
            
                default:
                System.out.println("Enter a Valid Choice !!!!!!!!!");
                    
            }
        }


    }
}

