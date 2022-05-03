package com.company;
/*
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
 */
public class stockbuysell {
    public static void main(String[] args) {
        int result = 0;
        int[] prices = { 100, 180, 260, 310,40, 535, 695 };
        for (int i = 1; i < prices.length; i++) {
            result = result + Math.max(prices[i] - prices[i - 1], 0);
        }
            System.out.print(result);
    }
}
