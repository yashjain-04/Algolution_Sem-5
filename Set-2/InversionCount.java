/* 2) Given an integer array arr[] of size n, the task is to find the count inversions of the given array.
 Two array elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

 Input: arr[] = {7, 2, 6, 3}
 Output: 4
 Explanation: Given array has 4 inversions: (7, 2), (7, 6), (7, 3), (6, 3)
*/

// class InversionCount{
//     static int inversionCount(int[] arr){
//         int count = 0;
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i+1;  j < arr.length; j++){
//                 if(arr[i] > arr[j]) count++;
//             }
//         }

//         return count;
//     }
//     public static void main(String args[]){
//         int[] nums = {7, 2, 6, 3};
//         System.out.println("Maximum subarray sum is : "+inversionCount(nums));
//     }
// }

// ================================================================================
// If one wants to print pairs also
// ================================================================================

// import java.util.ArrayList;

// class InversionCount{
//     static int inversionCount(int[] arr){
//         ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
//         int count = 0;
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i+1;  j < arr.length; j++){

//                 if(arr[i] > arr[j]){
//                     ArrayList<Integer> pair = new ArrayList<>();
//                     count++;
//                     pair.add(arr[i]);
//                     pair.add(arr[j]);
//                     pairs.add(pair);
//                 }
//             }
//         }

//         System.out.println(pairs);
//         return count;
//     }
//     public static void main(String args[]){
//         int[] nums = {7, 2, 6, 3};
//         System.out.println("Maximum subarray sum is : "+inversionCount(nums));
//     }
// }


//=================================================================================

import java.util.ArrayList;

class InversionCount{
    static class Pair{
        int first,second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }

        public String toString() {
            return "("+first+","+second+")";
        }
    }
    static int inversionCount(int[] arr){
        ArrayList<Pair> pairs = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1;  j < arr.length; j++){

                if(arr[i] > arr[j]){
                    count++;
                    pairs.add(new Pair(arr[i], arr[j]));
                }
            }
        }

        System.out.println(pairs);
        return count;
    }
    public static void main(String args[]){
        int[] nums = {7, 2, 6, 3};
        System.out.println("Maximum subarray sum is : "+inversionCount(nums));
    }
}
