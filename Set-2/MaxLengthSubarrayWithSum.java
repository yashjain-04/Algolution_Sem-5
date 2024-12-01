/*10)Given an integer array, find the maximum length subarray having a given sum.(USE
 HASHMAPConcept)

 Input:nums[] = { 5, 6,-5, 5, 3, 5, 3,-2, 0 }target = 8
 Output:{-5, 5, 3, 5 }

 Subarrays with sum 8 are {-5, 5, 3, 5 },{ 3, 5 },{ 5, 3 }
 The longest subarray is {-5, 5, 3, 5 } having length 4.
*/

import java.util.HashMap;

public class MaxLengthSubarrayWithSum
{
    static int[] maxLengthSubarray(int arr[], int target){
        int maxLength = 0;
        int endIndex = -1;
        int sum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            if(map.containsKey(sum - target)){
                if(i - map.get(sum - target) > maxLength){
                    maxLength = i - map.get(sum - target);
                    endIndex = i;
                }
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        
        int[] result = new int[maxLength];
        for(int i = 0; i < maxLength; i++){
            result[i] = arr[endIndex - maxLength + 1 + i];
        }
        
        return result;
    }
    
	public static void main(String[] args) {
	    int[] arr = {5,6,-5,5,3,5,3,-2,0};
	    int target = 8;
	    
	    int[] result = maxLengthSubarray(arr, target);
	    
	    System.out.print("Max Length Subaaray : ");
	    for(int ele : result){
	        System.out.print(ele+" ");
	    }
	}
}
