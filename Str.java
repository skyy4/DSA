import java.util.*;
public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String st = sc.nextLine();
        // System.out.println(st);

        // char ch = sc.nextLine().charAt(0);
        // System.out.println(ch);

        // String st = "sky";
        // System.out.println(st.charAt(1));

         char ch1 = 66;
         System.out.println(ch1);            //its complicated sometimes work          (int to char == type cast)

         char ch2  = 'A';
           ch2 = (char) (ch2+3);             //sometimes do not works we have to us explicit
         System.err.println(ch2);

    }
       
    
}
