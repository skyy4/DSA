import java.util.*;
public class nonRepeatingHashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nonRepeatingCheck(arr);

    }
    public static void nonRepeatingCheck(int arr[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(hm.containsKey(arr[i])==true){
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i =0;i<arr.length;i++){
            if(hm.get(arr[i]) == 1){
                System.out.println(arr[i]);
             return;
              
            }

        
        


    }
    System.out.println(-1);
    
}}
