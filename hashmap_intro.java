 import java.util.*;
public class hashmap_intro {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(10,20);
        hm.put(20,25);
        hm.put(30,30);
        // System.out.println(hm.get(20));
        // System.out.println(hm.get(40));
        // System.out.println(hm.containsKey(20));
        // hm.remove(30);
        // System.out.println(hm.containsKey(30));

        // other way of printing array using ForEach LOOP:

        // int arr[]={10,20,02,30,40};
        // for(int val : arr){
        //     System.out.println(val);
        // }


        //which can be used for printing hashmap value

        for(int key:hm.keySet()){
            System.out.println(key);
        }


        

    }
    
}
