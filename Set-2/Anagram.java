/*7) Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are anagrams of each other.

Examples:

Input: str1 = “listen”  str2 = “silent”
Output: “Anagram”
Explanation: All characters of “listen” and “silent” are the same.


Input: str1 = “gram”  str2 = “arm”
Output: “Not Anagram”
*/

import java.util.HashMap;

public class Anagram
{
    static boolean areAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        
        HashMap<Character, Integer> charFreq = new HashMap<>();
        
        for(char ch : s1.toCharArray()){
            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch : s2.toCharArray()){
            if(!charFreq.containsKey(ch)){
                return false;
            }
            
            charFreq.put(ch, charFreq.get(ch) - 1);
            
            if(charFreq.get(ch) == 0){
                charFreq.remove(ch);
            }
        }
        
        return charFreq.isEmpty();
    }
    
	public static void main(String[] args) {
	    String s1 = "listen";
	    String s2 = "silent";
	    
	    if(areAnagram(s1, s2)){
	        System.out.print("Anagram");
	    }
	    else{
	        System.out.print("Not Anagram");
	    }
	}
}