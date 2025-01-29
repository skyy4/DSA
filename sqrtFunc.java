import java.util.*;
public class sqrtFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int ans = sqrt(n);
        System.out.println("Square root of " + n + " is " + ans);

    
}
    public static int sqrt(int n){
        int ans=1;
        int i=1;
        while(i*i<=n){
            ans=i;
            i++;
        }
        return ans;

    }
}