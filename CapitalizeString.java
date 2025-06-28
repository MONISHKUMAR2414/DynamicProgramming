import java.util.*;
//input = "capiTalize tHe titLe" output = Capitalize The Title
public class CapitalizeString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String arr[] = st.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            String e = arr[i];

             String capitalized = e.substring(0, 1).toUpperCase() +
                                     e.substring(1).toLowerCase();
            sb.append(capitalized).append(" ");
        }

        System.out.print(sb.toString());
    }
}
