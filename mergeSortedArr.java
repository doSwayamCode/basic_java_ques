//merge sorted array

//make dummy arr
//logic :
//1. Create a new array to hold the merged result.
//2. Use two pointers to track the current index of each input array.
//3. Compare the elements at the pointers and add the smaller element to the merged array.
    
import java.util.Arrays;

class mergeSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = mergeArrays(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy any remaining elements 
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}
