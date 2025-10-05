//target element in array
//using binary search
class TargetElementBinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Target element " + target + " found at index: " + result);
        } else {
            System.out.println("Target element " + target + " not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if the target element is not found
    }
}