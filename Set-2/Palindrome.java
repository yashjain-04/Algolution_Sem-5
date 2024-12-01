/* 4)A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 removing all non-alphanumeric characters, it reads the same forward and backward.
 Alphanumeric characters include letters and numbers.

 Given a string s, return true if it is a palindrome, or false otherwise.

 Example 1:

 Input: s = “A man, a plan, a canal: Panama”
 Output: true
 Explanation: “amanaplanacanalpanama” is a palindrome.

 Example 2:

 Input: s = “race a car”;
 Output: false
*/

public class Palindrome
{
    static boolean isPalindromeString(String str){
        StringBuilder sb = new StringBuilder();
        
        for(char ch : str.toCharArray()){
            if(ch >= 65 && ch <= 90){
                sb.append((char)(ch+32));
            }
            else if(ch >= 97 && ch <= 122){
                sb.append(ch);
            }
        }
        
        System.out.println("String : "+sb);
        for(int i = 0; i < sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)) return false;
        }
        
        return true;
    }
	public static void main(String[] args) {
	    String str = "A man, a plan, a canal: Panama";
	    String str2 = "race a car";
		System.out.println(isPalindromeString(str));
		System.out.println(isPalindromeString(str2));
	}
}