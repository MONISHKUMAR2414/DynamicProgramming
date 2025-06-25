import java.util.*;

public class LongestConsequtiveBinaryString{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary String : ");

        String num = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        for(int i = 1 ; i < num.length(); i++){
            if(num.charAt(i-1)!= num.charAt(i)){

                ans.append(num.charAt( i-1));
            }

            else if(num.charAt(i-1) == num.charAt(i)){
                ans.delete(0, ans.length());
                continue;
            }
        }
        ans.append(num.charAt(num.length() - 1));

        System.out.print("The Longest NonConsequtive Binary String is : ");
        System.out.println(ans.toString());



        }
}

