//Greedy approach where I just sell previous one and buy new when the price dips.

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int currBuy = prices[0];
        int currMax = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<currMax){
                profit+=(currMax - currBuy);
                currBuy = currMax = prices[i];
            } else{
                currMax = prices[i];
            }
            if(prices[i]<currBuy){
                currBuy = prices[i];
            }
        }
        if(currBuy<currMax){
            return profit+=(currMax-currBuy);
        }
        return profit;
    }
}
