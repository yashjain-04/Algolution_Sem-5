/* 5) Given an array arr[] of size n, return an equilibrium index (if any) or-1 if no equilibrium index
 exists. The equilibrium index of an array is an index such that the sum of elements at lower
 indexes equals the sum of elements at higher indexes.

 Note: Return equilibrium point in 1-based indexing. Return-1 if no such point exists.
 Examples:

 Input: arr[] = {-7, 1, 5, 2,-4, 3, 0}
 Output: 4
 Explanation: In 1-based indexing, 4 is an equilibrium index, because:
 arr[1] + arr[2] + arr[3] = arr[5] + arr[6] + arr[7]

 Input: arr[] = {1, 2, 3}
 Output:-1
 Explanation: There is no equilibrium index in the array.

 Input:arr = {1, 3, 5, 2, 2}
 Expected Output:2
 Explanation: At index 2, the sum of elements on the left (1 + 3 = 4) is equal to the sum of
 elements on the right (2 + 2 = 4).
*/
//========================================================= O(n^2)

// public class EquilibriumIndex
// {
//     static int equilibriumIndex(int[] arr){
//         for(int i = 0; i < arr.length; i++){
//             int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;
//             int leftIdx = 0, rightIdx = i+1;
            
//             for(int idx = leftIdx; idx < i; idx++){
//                 leftSum += arr[idx];
//             }
            
//             for(int idx = rightIdx; idx < arr.length; idx++){
//                 rightSum += arr[idx];
//             }
            
//             if(leftSum == rightSum) return i;
//         }
        
//         return -1;
//     }
    
// 	public static void main(String[] args) {
// 	    int[] arr = {-7, 1, 5, 2, -4, 3, 0};
// 		System.out.println("Equilibrium Index In Array : "+equilibriumIndex(arr));
// 	}
// }

//========================================================== O(n)

public class EquilibriumIndex
{
    static int equilibriumIndex(int[] arr){
        int leftSum = 0, totSum = 0;
        
        for(int ele : arr){
            totSum += ele;
        }
        
        for(int i = 0; i < arr.length; i++){
            totSum -= arr[i];
            
            if(leftSum == totSum){
                return i;
            }
            
            leftSum += arr[i];
        }
        
        return -1;
    }
    
	public static void main(String[] args) {
	    int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println("Equilibrium Index In Array : "+equilibriumIndex(arr));
	}
}
