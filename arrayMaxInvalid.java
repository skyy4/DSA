import java.util.*;
public class arrayMaxInvalid {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0 ; i< n ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("no of element having atleast one no greater then itself are :");
        int result = countInt(arr);
        System.out.println(result);

    }
    public static int countInt(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0; i< arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        int count = 0;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]==max){
                count++;

            }
        }
        return arr.length-count;
    }

    
}
