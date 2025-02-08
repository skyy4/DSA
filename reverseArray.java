import java.lang.reflect.Array;
import java.util.*;
public class reverseArray {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
        reverse(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    
}   
   public static void reverse(int arr[]){
    int sp = 0;
    int lp = arr.length-1;
    while(sp<lp){
        int temp = arr[sp];
        arr[sp] = arr[lp];
        arr[lp] = temp;
        sp++;
        lp--;
    }



}}
