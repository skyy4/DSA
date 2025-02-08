import java.util.*;
public class toggleCharacter{
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char ch [] = new char[n];
        String st = sc.nextLine();
        for(int i=0;i<ch.length;i++){
            ch[i]=st.charAt(i);
        }
        toggle(ch);
        for(int i = 0;i<ch.length;i++){
            System.out.print(ch[i]+ " ");
        }
    }
    public static void toggle(char[] ch){
        for(int j = 0; j<ch.length;j++){
            if (ch[j]>=65 && ch[j]<=90) {
                ch[j]= (char)(ch[j]+32);             
            }
            else{
                ch[j]= (char)(ch[j]-32);             
            }
        }
    }
}