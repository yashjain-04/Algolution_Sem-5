/*Ques 11)Given an array of n positive integers. We are required to write a program to print the
minimum product of k integers of the given array.

Examples:
Input : 198 76 544 123 154 675
k = 2
Output : 9348
We get minimum product after multiplying
76 and 123.

Input : 11 8 5 7 5 100
k = 4
Output : 1400
*/

import java.util.PriorityQueue;

public class MinProductOfK
{
    static int findMinProduct(int[] arr, int k){
        if(k > arr.length){
            return 0;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int ele : arr){
            pq.add(ele);
        }
        
        int minProduct = 1;
        for(int i = 0; i < k; i++){
            minProduct *= pq.remove();
        }
        
        return minProduct;
    }
    
	public static void main(String[] args) {
	    int[] arr = {198, 76, 544, 123, 154, 675};
	    int k = 2;
	    System.out.println(findMinProduct(arr, k));
	    
	    arr = new int[] {11, 8, 5, 7, 5, 100};
	    k = 4;
	    System.out.println(findMinProduct(arr, k));
	}
}
