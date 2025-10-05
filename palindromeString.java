//check whether a given string is a palindrome or not
//two pointer

class palindromeString {
    public static void main(String[] args) {
        String str = "racecar";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
