//find missing number in an array

//given an array nums containing n distinct numbers in the range [0,n], return the only number in the range that is missing from the array.

class missingNumInArr {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
