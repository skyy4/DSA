import java.util.*;
public class factorOfPositiveInt {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    
}
