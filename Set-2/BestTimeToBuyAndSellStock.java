/*9)You are given an array of prices where prices[i] is the price of a given stock on an ith day. You
 want to maximize your profit by choosing a single day to buy one stock and choosing a
 different day in the future to sell that stock. Return the maximum profit you can achieve from
 this transaction. If you cannot achieve any profit, return 0.

 Input: prices = [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
*/

public class BestTimeToBuyAndSellStock
{
    static int maxProfit(int stocksPrice[]){
        int buyPrice = Integer.MAX_VALUE, maxProfit = 0;
        
        for(int i = 0; i < stocksPrice.length; i++){
            if(buyPrice < stocksPrice[i]){
                int profit = stocksPrice[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = stocksPrice[i];
            }
        }
        
        return maxProfit;
    }
    
	public static void main(String[] args) {
	    int stocksPrice[] = {9,8,7,6,5,4,3,2,1};
		System.out.println("Maximum Profit : "+maxProfit(stocksPrice));
	}
}