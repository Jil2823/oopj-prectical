// third practical of conversion meter to foot

import java.util.*;

public class pract3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// declaration of variable and input
		System.out.println("meter to foot converter");
			System.out.print("enter meters:");
			double meter = sc.nextDouble();
			// conversion into foot
			double foot = meter*3.28084;
			// final result (output)
			System.out.println("foot = "+foot);
		
	}
}