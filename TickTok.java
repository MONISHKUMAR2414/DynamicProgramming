import java.util.*;

public class TickTok{

    public static String tickBoard(int n, int arr[][]){
        char [] [] b = new char[n][n];
        for(int i = 0; i < arr.length; i ++){
            int row = arr[i][0];
            int col = arr[i][1];

             b[row][col] = (i % 2 == 0) ? 'X' : 'O';
        }
/// this for loop for rows and column checking !!!!!!!!!!!!
        for (int i = 0; i < 3; i++) {
            
            if (b[i][0] != 0 && b[i][0] == b[i][1] && b[i][1] == b[i][2]) {
                return b[i][0] == 'X' ? "A" : "B";
            }
        
            if (b[0][i] != 0 && b[0][i] == b[1][i] && b[1][i] == b[2][i]) {
                return b[0][i] == 'X' ? "A" : "B";
            }
        }

        //Diagonal
        if (b[0][0] != 0 && b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            return b[0][0] == 'X' ? "A" : "B";
        }

        // Anti-diagonal
        if (b[0][2] != 0 && b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            return b[0][2] == 'X' ? "A" : "B";
        }

        // Game state
        if (arr.length == 9) return "Draw";
        return "Pending";




    }



public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number Of Elements :");
    int n = sc.nextInt();

    int arr[][] = new int[n][2];
    System.out.println("Enter the Array Elements :");
    for (int i = 0; i < n; i++) {
        arr[i][0] = sc.nextInt(); // row
        arr[i][1] = sc.nextInt(); // col
    }


    String result =tickBoard(n, arr);
    
    System.out.println(result); 

}

}

