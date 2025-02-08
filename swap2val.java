import java.util.*;
public class swap2val {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the  index :");
        int a  = sc.nextInt();
        System.out.print("Enter the other index:");
        int b = sc.nextInt();

        swap (arr,a,b);
    

        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}  public static void swap( int [] arr,int a,int b ){

    int  temp = arr[a];
    arr[a]= arr[b];
    arr [b] = temp ;
    
    
    
    
}
 }
