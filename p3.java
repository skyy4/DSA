import java.util.*;
public class p3 {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    //     for(int i = 1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        int nst=1;
           for(int i =1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
             nst++;
             System.out.println();
           }
     }

}
