class Solution {
    public int maxProfit(int[] prices) {
        int maxSell = 0;
        int maxDiff = 0;
        for(int i = prices.length-1 ;i>=0; i--)
        {
            maxSell = Math.max(maxSell,prices[i]);
            maxDiff = Math.max(maxDiff,maxSell - prices[i]);
        }
        if(maxDiff<0)return 0;
        return maxDiff;
        
    }
}
