// practical 9 to calculate gcd using method overloading

/*Question: Write a method with following method header.
            public static int gcd(int num1, int num2)
Write a program that prompts the user to enter two integers and compute the gcd of two integers.*/

import java.util.*;

public class pract9{
	
	public static int gcd(int num1,int num2){
		int i = num1%num2;
		
		while(i!=0){
			num1=num2;
			num2=i;
			i = num1%num2;
			
		}
		return num2; 
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("GCD calculator");
		System.out.println("Enter number 1:");
		int x = sc.nextInt();
		System.out.println("Enter number 2:");
		int y = sc.nextInt();
		int z = gcd(x,y);
		System.out.println("the gcd is : "+z);
		
	}
}