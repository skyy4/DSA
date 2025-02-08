import java.util.*;
public class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String st = sc.nextLine();
        String result = reverse(st);
        System.out.println(result);
    
    }
    public static String reverse (String st){
        int x = st.length();
        char ch[]= st.toCharArray();
        int sp  = 0;
        int ep = x-1;
        while(sp<ep){
            char temp = ch [sp];
            ch[sp] = ch [ep];
            ch[ep]  = temp;
            sp++;
            ep--;
          

        }
            String ans = st.valueOf(ch);
            return ans;

    }
    
}
