import java.util.*;
public class diffBwPROnSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pro = 1;
        while(n>0){
            int ld = n%10;
            sum = sum + ld;
            pro = pro * ld;
            n = n/10;
        }
        int ans = pro-sum;
        System.out.println(ans);

    
}
   
}