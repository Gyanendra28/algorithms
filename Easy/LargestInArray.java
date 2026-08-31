package Easy;

// Given an arr[] of elements of size n, return the largest element given in the array.

public class LargestInArray {
    public static int largest(int arr[]) {
        int max = arr[0];

        /* Traverse array elements from 2nd index and compare every element with current max */
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {20, 10, 20, 4, 100};

        int result = largest(arr);
        System.out.println("Largest element in array is " + result);
    }
}
