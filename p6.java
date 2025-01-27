import java.util.*;
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //7
        int nsp=1;
        int nst=n/2+1;   //4
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
    }
    for(int k=1;k<=nsp;k++){
        System.out.print(" ");
}
for(int l=1;l<=nst;l++){
    System.out.print("*");
}
if(i<=n/2){
nsp=nsp+2;
nst--;
System.out.println();
}
else{
nsp=nsp-2;
nst++;
System.out.println();
    

}
       
}}}
