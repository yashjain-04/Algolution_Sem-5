/*3)Given an integer array nums and an integer k, return the kth largest element in the array.
 Note that it is the kth largest element in the sorted order, not the kth distinct element.
 Solve it without sorting.

 Example:
 Input: nums = [3,2,1,5,6,4], k = 2
 Output: 5
 */

//====================================================== TC : O(n logn + k logn) SC : O(n)

// import java.util.PriorityQueue;

// public class KthLargestElement
// {
//     static int kthLargestElement(int[] arr, int k){
//         if(arr.length < k){
//             return -1;
//         }
        
//         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b.compareTo(a));
        
//         for(int ele : arr){
//             pq.add(ele);;
//         }
        
//         while(k != 1){
//             pq.poll();
//             k--;
//         }
        
//         return pq.poll();
//     }
    
// 	public static void main(String[] args) {
// 	    int[] arr = {3,2,1,5,6,4};
// 	    int k = 4;
// 		System.out.println(k+" largest element in array is : "+kthLargestElement(arr, k));
// 	}
// }

//=============================================================TC : O(n log k) / SC : O(k)

import java.util.PriorityQueue;

public class KthLargestElement
{
    static int kthLargestElement(int[] arr, int k){
        if(arr.length < k){
            return -1;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        
        for(int ele : arr){
            pq.offer(ele);
            if(pq.size() > k){
                pq.poll();
            }
        }
        
        return pq.peek();
    }
    
	public static void main(String[] args) {
	    int[] arr = {3,2,1,5,6,4};
	    int k = 2;
		System.out.println(k+" largest element in array is : "+kthLargestElement(arr, k));
	}
}