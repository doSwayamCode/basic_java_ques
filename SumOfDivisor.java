//write a code to find the sum of the divisor of N integer

//logic : ex- 48
//1,2,3,4,6,8,12,16,24,48
//sum = 1+2+3+4+6+8+12+16
//sum = 1+2+3+4+6+8+12+16+24+48


class SumOfDivisor {
    public static void main(String[] args) {
        int N = 12; 
        int sum = findSumOfDivisors(N);
        System.out.println("Sum of divisors is " +N + sum);
    }

    
    public static int findSumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
