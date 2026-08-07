class Solution {
    // Dynamic programming
    public int maxProfit(int[] prices) {
        int max  = 0;
        int low  = prices[0];
        for (int  i = 0; i < prices.length; i++) {
            if (prices[i] < low) {
                low = prices[i];
            }
            max = Math.max(prices[i] - low, max);
        }

        return max;
    }
}
