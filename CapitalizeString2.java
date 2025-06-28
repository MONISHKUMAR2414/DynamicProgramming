import java.util.*;
public class CapitalizeString2 {
public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String arr[] = st.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            String e = arr[i];
            if(e.length()>2){
             String capitalized = e.substring(0, 1).toUpperCase() +
                                     e.substring(1).toLowerCase();
            sb.append(capitalized).append(" ");}


            else{
                String c = e.substring(0).toLowerCase();
                sb.append(c).append(" ");
            }
        }

        System.out.print(sb.toString());
}
}