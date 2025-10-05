//count the occurances of the given element in an array.

class countOccurances {
    public int countElement(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
