import java.util.*;

public class ProductSelf{

      public static int  productSum(  int n ,int arr[]){
      
              int leftArr[] = new int[n];
              int rightArr[] = new int[n];
              int sol[] = new int[n];
      
                  leftArr[0] = 1;
                  for(int j = 1 ; j < arr.length; j++){
                    leftArr[j] = leftArr[j - 1] * arr[j - 1];
                  }
                  
             rightArr[n-1] =1;
              for(int i = n-2 ; i >=0 ; i--){
                rightArr[i] = rightArr[i + 1] * arr[i + 1];
              }
      
              for(int i = 0 ; i < n ; i++){
                  sol[i] = rightArr[i]*leftArr[i];
              }
      
              for(int i = 0 ; i < n ; i ++){
                  System.out.print(sol[i]+ " ");
              }
                      return 1;
      
      
          }
      
      
          public static void  main(String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the Number Of Elements :");
              int n = sc.nextInt();
      
              int arr[] = new int[n];
              System.out.println("Enter the Array Elements :");
              for(int i = 0 ; i < n ; i ++){
                  arr[i] = sc.nextInt();
              }
      
              int result =productSum(n, arr);
              System.out.println();
              System.out.println("The program Has Been executed Succesfullly!!!!!!!!!"); 



    }
}

