//largest number in array

class largestNumInArray{
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int largest = findLargest(arr);
        System.out.println("The largest number in the array is: " + largest);
    }

    public static int findLargest(int[] array) {
        int max = array[0]; // Assume first element is the largest
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is larger
            }
        }
        return max;
    }
}