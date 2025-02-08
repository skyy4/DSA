import java.util.*;

public class rotateArr {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid array size.");
            return;
        }

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of times to rotate: ");
        int k = sc.nextInt();

        // Handle cases where k > n
        k = k % n;
        if (k == 0) {
            System.out.println("Array remains the same after rotation.");
            return;
        }

        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining n-k elements
        reverse(arr, k, n - 1);

        System.out.println("Array after " + k + " times rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}