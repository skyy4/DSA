import java.util.*;
public class frequencyHashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr [] = new int[len];
        for(int i =0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int len2 = sc.nextInt();
        int quer [] = new int[len2];
        for(int j=0;j<len2;j++){
            quer[j]=sc.nextInt();
        }
        freqCheck(arr,quer);

    }
    public static void freqCheck(int arr[],int quer[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
          
            if(hm.containsKey(arr[i])==true){
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp+1);

            }
            else{
                hm.put(arr[i], 1);
            }

        }
        for(int i=0;i<quer.length;i++){
            int val = quer[i];
    
            if(hm.containsKey(val)==true){
                System.out.println(hm.get(val));
              
        

            }
            else{
                System.out.println(0);
            }

        }
        
        
    }
    
}
