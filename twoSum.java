import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        boolean result = TwoSUM(arr, k);
        System.out.println(result);
    }

    public static boolean TwoSUM(int arr[], int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true; // Return true if a valid pair is found
                }
            }
        }
        return false; // Return false only after checking all pairs
    }
}