import java.util.*;
public class logicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // if(num%2 ==0 || num%3 ==0){
        //     System.out.println("Number is divisible by 2 or 3");
        // }
        // else{
        //     System.out.println("Number is not divisible by 2 or 3");
        // }
        if(num%2 ==0 && num%3 ==0){
            System.out.println("Number is divisible by 2 or 3");
        }
        else{
            System.out.println("Number is not divisible by 2 or 3");
        }
    }
}
