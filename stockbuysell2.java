package com.company;
/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class stockbuysell2 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int max=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(prices[i]<prices[j])
                {
                    int sum=prices[j]-prices[i];
                    if(max<sum)
                    {
                        max=sum;
                    }
                }
            }

        }
        System.out.println(max);
    }
}
