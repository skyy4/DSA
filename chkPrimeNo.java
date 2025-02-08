import java.util.*;
public class chkPrimeNo {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=n;i++){
           if(n%i==0){
            count++;
           }
            }
            if(count==2){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime Number");
            }
            
        }
        
    }
    
