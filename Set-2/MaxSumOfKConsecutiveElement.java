/*8)Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’
 consecutive elements in the array(Using Sliding Window Technique)

 Input : arr[] = {100, 200, 300, 400}, k = 2
 Output : 700

 Input : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
 Output : 39
 Weget maximum sum by adding subarray {4, 2, 10, 23} of size 4.

 Input : arr[] = {2, 3}, k = 3
 Output : Invalid
 There is no subarray of size 3 as size of whole array is 2.
*/

// public class MaxSumOfKConsecutiveElement
// {
//     static int[] maxSum(int[] arr, int k){
//         if(arr.length < k) return new int[0];
        
//         int maxSum = Integer.MIN_VALUE;
//         int leftIdx = -1, rightIdx = -1;
        
//         for(int i = 0; i < arr.length - k; i++){
//             int sum = 0;
//             for(int j = i; j < i+k; j++){
//                 sum += arr[j];
//             }
            
//             if(sum > maxSum){
//                 maxSum = sum;
//                 leftIdx = i;
//                 rightIdx = i+k;
//             }
//         }
        
//         int ans[] = new int[k+1];
//         int idx = 0;
        
//         for(int i = leftIdx; i < rightIdx; i++){
//             ans[idx++] = arr[i];
//         }
        
//         //Last Index Of Array Contains the Maximum Sum We Had Found!
//         ans[idx] = maxSum;
        
//         return ans;
//     }
    
// 	public static void main(String[] args) {
// 	    int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
// 	    int k = 4;
		
// 		int result[] = maxSum(arr, k);
		
// 		System.out.print("Maximum sum of "+k+" consecutive elements in the array : ");
// 		for(int ele : result){
// 		    System.out.print(ele+" ");
// 		}
// 		System.out.print("\nMaximun Sum : "+result[k]);
// 	}
// }

// ========================================(Sliding Window : O(n)

public class MaxSumOfKConsecutiveElement
{
    static int maxSum(int[] arr, int k){
        if(arr.length < k){
            System.out.println("Invalid");
            return -1;
        }
        
        int maxSum = 0;
        
        for(int i = 0; i < k; i++){
            maxSum += arr[i];
        }
        
        int windowSum = maxSum;
        for(int i = k; i < arr.length; i++){
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }
    
	public static void main(String[] args) {
	    int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
	    int k = 4;
		
		System.out.print("Maximun Sum : "+maxSum(arr, k));
	}
}