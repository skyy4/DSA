import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        checkUniq(arr);

    }
    public static void checkUniq(int arr[]){
        HashSet<Integer>hs=new HashSet<>();
        for(int i =0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.err.println(hs.size());
    }
    
}
