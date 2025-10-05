//given an array, we have found the num of occurances of each elemnt in the array.


//hashmap is used to store the elements and their counts. stores as key, val pair.
import java.util.HashMap;
class numOfOcc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
    }
}
