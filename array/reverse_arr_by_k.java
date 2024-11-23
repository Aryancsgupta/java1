import java.util.*;

public class reverse_arr_by_k {
    static int[] swap(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static void reverse(int[] arr, int num) {
        int len = arr.length;
        num = num % len; // Ensure num is within the bounds of the array length
        arr = swap(arr, len - num, len - 1); // Reverse the last num elements
        arr = swap(arr, 0, len - num - 1); // Reverse the first len-num elements
        arr = swap(arr, 0, len - 1); // Reverse the entire array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number by which to reverse the array:");
        int num = sc.nextInt();
        reverse(arr, num);
    }
}
