class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxDiff = 0;
        for(int i = 1;i<prices.length; i++)
        {
            minBuy = Math.min(minBuy,prices[i]);
            maxDiff = Math.max(maxDiff,prices[i] - minBuy);
        }
        if(maxDiff<0)return 0;
        return maxDiff;
        
    }
}

