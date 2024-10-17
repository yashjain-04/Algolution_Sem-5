//Ques 1. Write a program to count total number of negative numbers in an array. 

public class CountNegative 
{ 
    static int countNegativeNum(int[] arr){ 
        int count = 0; 
        for(int i=0; i<arr.length; i++){ 
            if(arr[i] < 0){ 
                count++; 
            } 
        } 
         
        return count; 
    } 
     
     public static void main(String[] args) { 
      int[] arr = {1,4,7,-8,-4,8,3,-9,6,-4,-2,-8,9,6,5,-2}; 
      System.out.println("Total Count of Negative Numbers in Array is : "+countNegativeNum(arr)); 
     } 
} 