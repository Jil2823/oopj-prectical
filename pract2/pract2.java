// second practical using cramer rule

import java.util.*;

public class pract2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// making variables to enter values of a1,b1 and c1  from equation 1
		System.out.println("Enter the value of a1 from equation 1:");
		double a1 = sc.nextDouble();
		System.out.println("Enter the value of b1 from equation 1:");
		double b1 = sc.nextDouble();
		System.out.println("Enter the value of c1  from equation 1:");
		double c1 = sc.nextDouble();
		
		// making variables to enter values of a2, b2 and c2 from equation 2
		System.out.println("Enter the value of a2 from equation 2:");
		double a2 = sc.nextDouble();
		System.out.println("Enter the value of b2 from equation 2:");
		double b2 = sc.nextDouble();
		System.out.println("Enter the value of c2  from equation 2:");
		double c2 = sc.nextDouble();
		
		// iroducing x and y and final calculation 
		double x,y;
		// the equation of x and y as per the cramer's rule
		x = ((c1*b2)-(b1*c2))/((a1*b2)-(b1*a2));
		y = ((a1*c2)-(c1*a2))/((a1*b2)-(b1*a2));
		
		// printing the final values of x and y
		
		System.out.println("The value of x = "+x);
		System.out.println("The value of y = "+y);
	}
}