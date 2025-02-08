import java.util.*;
public class optimisationFactorNprime {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int chk = (int)Math.sqrt(n);
        int count = 0;
        for(int i =1;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i){
                    count+=2;
                }
                else{
             count++;
            }}
            
    }
    if(count==2){
        System.out.println("n is prime");
    }
    else
    {
      System.out.println("n is not prime");
    }
    // System.out.println(count);
    
}}
