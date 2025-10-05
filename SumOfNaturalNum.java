//write a program to find the sum of natural numbers using recursion.

class SumOfNaturalNum {
    public static void main(String[] args) {
        int n = 5; 
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of natural numbers " + n + sum);
    }


    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1; 
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }
}
