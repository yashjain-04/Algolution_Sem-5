import java.util.Arrays;
import java.util.Scanner;

class MrString{
    static String returnString(int num){
        switch (num) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
        }

        return null;
    }

    static String totUnorderedPair(int[] arr){
        int d = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2 || arr[i] == 6){
                d += 1;
            }
            else{
                d += 2;
            }
        }

        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;
        int pairCount = 0;

        while(left < right){
            int currSum = arr[left] + arr[right];

            if(currSum == d){
                arr[left] = 0;
                arr[right] = 0;
                pairCount++;
                left = 0;
                right = arr.length - 1;
                Arrays.sort(arr);
            }
            else if(currSum < d){
                left++;
            }
            else{
                right--;
            }
        }

        return returnString(pairCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total elements : ");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter elements : ");
        for(int i = 0; i < N; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(totUnorderedPair(arr));
        sc.close();
    }
}