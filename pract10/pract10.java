// practical 10 

/* Question: Write a test program that prompts the user to enter ten numbers,
 invoke a method to reverse the numbers, display the numbers.*/
 
 import java.util.*;

 public class pract10{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int[] arr = new int[10];
         System.out.println("Number list reverser");
         System.out.println("Enter 10 numbers:");
         for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
         }
         System.out.println("Reverse list:");
         for(int i=arr.length-1;i>=0;i--){
             System.out.print(arr[i]+",");
         }
     }
 }