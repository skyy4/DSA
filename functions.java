import java.util.*;
public class functions {
    public static int factorial(int n){
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
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);
        int ans = nfact/(rfact*nmrfact);
        System.out.println(ans);

    }
   
    
}
