import java.util.*;

public class CanSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elelmets need: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();

        }
        System.out.println("Enter the Target Element: ");
        int targetSum = sc.nextInt();

        boolean [] ans = new boolean[targetSum+1];

        ans[0] = true;

        for(int i = 0 ; i <targetSum; i++){
            if(ans[i]){
                for(int j = 0 ; j < n ; j++){
                    if(i+a[j] <= targetSum){
                        ans[i+a[j]] = true;
                    }
                }
            }
        }

        if (ans[targetSum])
            System.out.println("true");
        else
            System.out.println("false");


    }
}