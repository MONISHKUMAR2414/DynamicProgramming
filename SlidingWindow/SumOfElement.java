import java.util.*;

public class SumOfElement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Elements :" );
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Array Of Elements :" );

        for(int i  = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target Element :" );
        int traget = sc.nextInt();

        int j = 0 ; 
        int k = 0 ; 
        int sum = 0 ; 
        //Using Sliding window we are going to perform the sum of elemetns is present in it or not if present return the true or else false 
        
        while( j < arr.length){
            if(sum < traget){
                sum = sum + arr[j];
                j++;
            }

            else if (sum > traget){
                sum = sum - arr[k];
                k++;
            }

            else if (sum == traget){
                System.out.println("There is a sum present in that array !!! so ITs True..");
                break;
            }
        }

        if(sum != traget){
            System.out.println("There is No a sum present in that array !!! so ITs False..");
        }

    }
}