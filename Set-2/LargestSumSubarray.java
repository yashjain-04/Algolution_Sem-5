/*1)Given an integer array nums, find the subarray with the largest sum, and return its sum.

 Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 Output: 6
 Explanation: The subarray [4,-1,2,1] has the largest sum 6
*/

class LargestSumSubarray{
    static int largestSubarraySum(int[] arr){
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i <arr.length; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
    public static void main(String args[]){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum is : "+largestSubarraySum(nums));
    }
}