//Ques 2. Write a program that takes 5 integers as input from the user and print Max of all the numbers. 
 
 
import java.util.Scanner; 
public class MaximumElement 
{ 
    static int maxInArray(int[] arr){ 
        int max = Integer.MIN_VALUE; 
         
        for(int i=0; i<arr.length; i++){ 
            max = Math.max(max, arr[i]); 
        } 
         
        return max; 
    } 
     
 public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter Size of Array : "); 
    int n = sc.nextInt(); 
    
    int arr[] = new int[n]; 
    
    for(int i=0; i<n; i++){ 
        System.out.print("\nEnter "+(i + 1)+" element : "); 
        arr[i] = sc.nextInt(); 
    } 
    
    System.out.print("\nMaximum Element in an array is : "+maxInArray(arr)); 

    sc.close();
 } 
} 