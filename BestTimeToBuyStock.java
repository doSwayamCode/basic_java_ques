//best time to buy and sell stock

//you want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.


//logic :
//1. Find the minimum price in the array
//2. Find the maximum profit by subtracting the minimum price from the current price
//3. Update the minimum price if the current price is lower than the minimum price

//using minimum and maximum functions


class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Initialize to a very high value
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price if the current price is lower
            minPrice = Math.min(minPrice, price);

            // Calculate the potential profit and update maxProfit if it's higher
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
