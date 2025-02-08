import java.util.*;
public class reversePartArr{
    public static void main (Strings [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.print("Enter the first index : ");
        int s = sc.nextInt(); 
        System.out.print("Enter the other index : ");
        int e = sc.nextInt();
        for(int i = 0  ; i < n ; i++){       //input
            arr[i]= sc.nextInt();
        }
        

        if (s < 0 || e >= n || s > e) {
            System.out.println("Invalid indices! Make sure 0 ≤ s ≤ e < " + n);
        } else {
            revArr(arr, s, e); 
            System.out.println("Modified array:");    //output
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
        }

        
    }

    public static void revArr(int arr[],int s,int e){
      int sp = s;
      int ep= e;
      while(sp<ep){
        int temp = arr[sp];
        arr[sp]= arr[ep];
        arr [ep]= temp;
        sp++;
        ep--;
      }

    }
}
