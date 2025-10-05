//calculate and return the difference between the sum of square roots of even numbers and the sum of square roots of odd numbers in the range from m to n (inclusive).

class diffOfSumAndSqrt {
    public double calculateDifference(int m, int n) {
        double evenSum = 0;
        double oddSum = 0;

        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += Math.sqrt(i);
            } else {
                oddSum += Math.sqrt(i);
            }
        }
        return evenSum - oddSum;
    }
}
