package Searching;

/* Given an array, arr[] of n integers, and an integer element x, find whether element x is present in the array.
Return the index of the first occurrence of x in the array, or -1 if it doesn't exist. */

public class LinearSearch {
    public static int search(int arr[], int x) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40, 10};
        int x = 10;

        int result = search(arr, x);
        if(result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
