//rearrange array elements by sign
//you are given a 0 indexed integer array nums of even length consisting of an equal number of positive and negative integers.

//+ - + - + -
//using 2-array list
import java.util.Arrays;
class rearrangeEleBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] rearrangedArray = rearrangeArray(nums);
        System.out.println(Arrays.toString(rearrangedArray));
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int posIndex = 0; // Index for positive numbers
        int negIndex = 1; // Index for negative numbers

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2; // Move to the next positive index
            } else {
                result[negIndex] = num;
                negIndex += 2; // Move to the next negative index
            }
        }
        return result;
    }
}
