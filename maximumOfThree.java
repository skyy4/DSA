import java.util.*;
public class maximumOfThree {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println( " max is "+a);
        }
        else if(b>=a && b>=c){
            System.out.println("max is "+b);
    }
    else{
        System.out.println("max is "+c);
    }
}
}
