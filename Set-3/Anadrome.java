/*Ques 12)Anadrome - An Anagramic Palindrome

Description:
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once. A Palindrome is a word, phrase, number, or
other sequence of characters which reads the same backward as forward. Brijesh knows
Anagrams and Palindromes. His teacher gives him a string and asks him to find if there exists
any anagram of the given string such that it is also a Palindrome. If so then print Yes, otherwise
print No.

Input Format
The first line contains t, which represents number of strings. The next t lines contain strings.
Constraints
1<=t<=5
1<=x<=10000 where x denotes string length
Strings contain only lowercase english alphabets.

Output Format
For each string print Yes if there exists an Anagram that is a Palindrome, else print No, in a new
line

Sample Input:
3
daamm
rfeer
motor

Sample Output:
Yes
Yes
No

Explanation:
The string daamm has an anagram --> madam which is a palindrome. So print Yes.
The string rfeer has an anagram --> refer which is a palindrome. So print Yes.
The string motor has no anagram which is also a palindrome. So print No.
*/

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Anadrome
{
    static boolean anagramicPalindrome(String str){
        Map<Character, Integer> freq = new HashMap<>();
        
        for(char ch : str.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        
        int requiredOddCount = 0;
        if( (str.length() & 1) != 0){
            requiredOddCount = 1;
        }
        
        int actualOddCount = 0;
        
        for(char ch : str.toCharArray()){
            if( (freq.get(ch) & 1) != 0){
                actualOddCount++;
            }
        }
        
        
        return actualOddCount == requiredOddCount;
    }
    
	public static void main(String[] args) {
		System.out.print("\nEnter total no. of test cases : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
		    System.out.print("\nEnter String "+(i+1)+" : ");
		    String str = sc.next();
		    System.out.println("'"+str+"' is Anagramic Palindrome : "+anagramicPalindrome(str));
		}
	}
}
