import java.util.*;
public class functions {
    public static int fact(int n){
       int  ans = 1;
        for(int i=1; i<=n;i++){
            ans = ans * i;
        }
        // System.out.println(ans);
         return ans;

    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = fact(n);
        int rfact = fact(r);
        int nmrfact = fact(n-r);
        int ans = nfact/(rfact*nmrfact);
        System.out.println(ans);

    }
   
    
}
