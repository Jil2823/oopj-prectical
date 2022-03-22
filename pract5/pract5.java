//practical 5 to make decreasing order of 3 numbers

/* Question: Write a program that prompts the user to enter three integers and display the integers in decreasing order. */

import java.util.*;

public class pract5{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			//for input
			System.out.println("enter num 1 ,2 and 3: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int temp;
			// for swapping
			 if(num1<num3){
				temp = num1;
				num1 = num3;
				num3 = temp;
			}
			
			else if(num2<num3){
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			
             else if(num1<num2){
				temp = num1;
				num1 = num2;
				num2 = temp;
			 }
			 
			//for output
			    System.out.println("Decreasing order is :"); 
	            System.out.println(num1+","+num2+","+num3);
		}
}