import java.util.*;

public class counting {

    public static void main(String[] args) {
        System.out.println("Enter the Integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String st = String.valueOf(n);
        int count = 0;

        for (int i = 0; i < st.length();) {
            char ch = st.charAt(i);

            if (ch != '0') {
                count++;
                i++;
            } else {
                
                count++;
                while (i < st.length() && st.charAt(i) == '0') {
                    i++;
                }
            }
        }

        System.out.println("Group count: " + count);
    }
}
