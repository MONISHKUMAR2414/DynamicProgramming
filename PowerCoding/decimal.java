import java.util.*;

class decimal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String numstr = String.valueOf(num);
        StringBuilder st = new StringBuilder();
        st.append("0.").append(numstr).append(" ");

        for(int i = 1 ; i < numstr.length(); i++){
            String b = numstr.substring(0, i);
            String a = numstr.substring(i);
            String combine = b+ "."+a;
            st.append(combine).append(" ");
        }

        st.append(numstr).append(".0").append(" ");

        System.out.println(st.toString().trim());
    }
}