/*Ques 9) Given two strings text1 and text2, return the length of their longest common subsequence. If
there is no common subsequence, return 0.
A subsequence of a string is a new string generated from the original string with some
characters (can be none) deleted without changing the relative order of the remaining
characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

Example 1:
Input: text1 = "abcde", text2 = "ace"
Output: 3
Explanation: The longest common subsequence is "ace" and its length is 3.

Example 2:
Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
*/

public class LongestCommonSubsequence
{
    static int longestCommonSubsequence(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] grid = new int[len1+1][len2+1];
        
        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    grid[i][j] = grid[i-1][j-1] + 1; 
                }
                else{
                    grid[i][j] = Math.max(grid[i-1][j], grid[i][j-1]);
                }
            }
        }
        
        return grid[len1][len2];
    }
    
	public static void main(String[] args) {
	    String str1 = "abcde";
	    String str2 = "ace";
	    System.out.println("Longest common subsequence in '"+str1+"' and '"+str2+"' is of length : "+longestCommonSubsequence(str1, str2));
	}
}
