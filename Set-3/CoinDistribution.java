/*Ques 8) Given an integer array of coins[ ] of size N representing different types of denominations and
an integer sum, the task is to count all combinations of coins to make a given value sum.
Note: Assume that you have an infinite supply of each type of coin.

Examples:

Input: sum = 4, coins[] = {1,2,3}
Output: 4
Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2} and {1, 3}

Input: sum = 10, coins[] = {2, 5, 3, 6}
Output: 5
Explanation: There are five solutions:
{2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}

Input: sum = 10, coins[] = {10}
Output: 1
Explanation: The only is to pick 1 coin of value 10.

Input: sum = 5, coins[] = {4}
Output: 0
Explanation: We cannot make sum 5 with the given coins
*/

import java.util.Scanner;

public class CoinDistribution
{
    static int totCombination(int[] coins, int sum){
        int dp[] = new int[sum+1];
        dp[0] = 1;
        
        for(int coin : coins){
            for(int i = coin; i <= sum; i++){
                dp[i] += dp[i - coin];
            }
        }
        
        return dp[sum];
    }
    
	public static void main(String[] args) {
		System.out.println(totCombination(new int[]{2,5,3,6}, 10));
	}
}
