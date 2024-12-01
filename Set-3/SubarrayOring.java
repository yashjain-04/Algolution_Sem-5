// public class SubarrayOring {
//     static int subarrayOring(int[] arr){
//         int result = 0;

//         for(int ele : arr){
//             result |= ele;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,4,6};
//         int[] arr1 = {10,100,1000};
//         System.out.println(subarrayOring(arr));
//         System.out.println(subarrayOring(arr1));
//     }
// }



public class SubarrayOring {
    static int subarrayOring(int[] arr){
        int resultOR = 0;

        for(int i = 0; i < arr.length; i++){
            int currOR = 0;
            for(int j = i; j < arr.length; j++){
                currOR |= arr[j];

                resultOR |= currOR;
            }
        }

        return resultOR;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6};
        System.out.println(subarrayOring(arr));
    }
}
