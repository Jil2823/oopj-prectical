//practical 7 to generate randomly a 4 digit vihical number

/*Question: Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a program to generate a plate number.*/

import java.util.*;

public class pract7{
	public static void main(String args[]){
		// choosing a random numbers to generate plate number
		int alpha1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
		int alpha2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
		int alpha3 = 'A' + (int)(Math.random() * ('Z' - 'A')); 
		int digit1 = (int)(Math.random() * 10);
		// output
		  System.out.println("Plate number is : " + (char)(alpha1) + ((char)(alpha2)) + 
   ((char)(alpha3)) + digit1);
	}
}