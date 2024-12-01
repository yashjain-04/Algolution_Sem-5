/* 6)Given a sorted array A (sorted in ascending order), having N integers, find if there exists any
 pair of elements (A[i], A[j]) such that their sum is equal to X.

 a)Using Naive Approach
 b)Using Two Pointer Technique

 Input: A = [1, 2, 4, 5, 7, 11]
 N=6
 X =9

 Expected Output: Yes
 (Explanation: The pair (2, 7) sums to 9.)
*/
//================================================================== O(n^2)

// public class PairSum
// {
//     static String targetSumPair(int arr[], int target){
//         for(int i = 0; i < arr.length; i++){
//             int currNum = arr[i];
            
//             for(int j = i+1; j < arr.length; j++){
//                 if( (currNum + arr[j]) == target ){
//                     return "Yes!";
//                 }
//             }
//         }
        
//         return " No!";
//     }
    
// 	public static void main(String[] args) {
// 	    int arr[] = {1,2,4,5,7,11};
// 	    int target = 9;
// 		System.out.println("Does array have any pair havinf a sum "+target+" : "+targetSumPair(arr, target));
// 	}
// }

//================================================================= O(n)

// public class PairSum
// {
//     static String targetSumPair(int[]  arr,int target){
//         int left = 0, right = arr.length - 1;
        
//         while(left < right){
//             int currSum = arr[left] + arr[right];
            
//             if(currSum == target) return "Yes!";
//             else if(currSum < target) left++;
//             else right--;
//         }
        
//         return "No!";
//     }
    
// 	public static void main(String[] args) {
// 		int arr[] = {1,2,4,5,7,11};
// 	    int target = 9;
// 		System.out.println("Does array have any pair havinf a sum "+target+" : "+targetSumPair(arr, target));
// 	}
// }

// =================================================================
// if one want to print pairs also;
// =================================================================

import java.util.ArrayList;

public class PairSum
{
    static ArrayList<String> targetSumPair(int[]  arr,int target){
        int left = 0, right = arr.length - 1;
        ArrayList<String> pairs = new ArrayList<>();
        
        while(left < right){
            int currSum = arr[left] + arr[right];
            
            if(currSum == target){
                pairs.add("Yes!, Pair : ("+arr[left]+", "+arr[right]+")");
                left++;
            }
            else if(currSum < target) left++;
            else right--;
        }
        
        return pairs;
    }
    
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
	    int target = 50;
		System.out.println("Does array have any pair havinf a sum "+target+" : \n"+targetSumPair(arr, target));
	}
}