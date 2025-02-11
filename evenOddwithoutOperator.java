import java.util.*;
public class evenOddwithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        if((x&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
