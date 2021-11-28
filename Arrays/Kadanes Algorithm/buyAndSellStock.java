// problem link :- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

class Solution {
    public int maxProfit(int[] prices) {
        int max_so_far = 0, max_ending_here = 0;
        
        for (int i = 1; i < prices.length; i++) {
            max_ending_here = max_ending_here + (prices[i] - prices[i-1]);
            
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        
        return max_so_far;
    }
}
