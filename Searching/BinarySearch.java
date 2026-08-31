package Searching;

/* Binary Search is a searching algorithm that operates on a sorted or monotonic search space,
repeatedly dividing it into halves to find a target value or optimal answer in logarithmic time O(log N). */

public class BinarySearch {
    public static int search(int arr[], int x) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            // check if x is present at mid
            if(arr[mid] == x) {
                return mid;
            }

            // if x is greater, ignore low half
            if(arr[mid] < x) {
                low = mid + 1;
            }

            // if x is smaller, ignore high half
            else {
                high = mid - 1;
            }
        }

        // if we reach here, then element was not present
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;

        int result = search(arr, x);
        if(result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
