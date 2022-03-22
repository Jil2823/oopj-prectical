//practical 4 to calculate Body Mass Index

import java.util.*;
 
public class pract4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// inroducinng BMI , weight in pound = WP , weight in kilograms = WK
		// height in inches = HI , height in meters = HM
			System.out.println("Body Mass Index Calculator");
			System.out.println("Enter your weight in pounds:");
			double WP = sc.nextDouble();
			System.out.println("Enter your height in inches:");
			double HI = sc.nextDouble();
			// conversion of height in to meters and weight into kilograms
			double HM = HI/ 39.37;
			double WK = WP/2.205;
			// calculation of BMI
			double bmi = WK/(HM*HM);
			//printing the index 
			System.out.println("Your Body Mass Index ratio is: "+bmi); 
	}
}