class Solution {

    // Two pointers
    public int maxProfit(int[] prices) {
        int b = 0;
        int s = 1;
        int max = 0;

        while ( s < prices.length) {
            int profit = prices[s] - prices[b];
            max = Math.max(max, profit);
            if (profit < 0) {
                b = s;
            } 
            s++;
        }

        return max;
    }
}
