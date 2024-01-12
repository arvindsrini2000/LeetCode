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


//Slightly different approach - We just sell when the previous day's price is lesser than current Day's - Greedy.
//This would end up in the max profit any how.

//Consider case - 1,2,3,4,5
//In first program - we buy at 1 and sell at 5.
//In this program - we buy at 1 sell at 2, buy at 2 and sell at 3, etc,.

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
