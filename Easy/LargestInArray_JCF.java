package Easy;

import java.util.Arrays;

// Given an arr[] of elements of size n, return the largest element given in the array.

public class LargestInArray_JCF {
    public static int largest(int arr[]) {
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = {20, 10, 20, 4, 100};

        int result = largest(arr);
        System.out.println("Largest element in array is " + result);
    }
}
