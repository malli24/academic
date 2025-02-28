import java.util.*;
class CountArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Input array size
        int arr[] = new int[n]; // Declare the array
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Sort the array
        int max = arr[n - 1]; // Find the maximum

        int ns[] = new int[n]; // Declare ns array
        int s = 0, k = 0;

        // Populate ns array
        for (int i = 0; i < n; i++) {
            s = arr[i];
            ns[k] = s;
            k++;
        }

        // Print every third element
        for (int i = 0; i < n; i += 3) {
            System.out.print(ns[i] + " ");
        }
    }
}
