//practical 6 to show that latter is vowel or not 

/*Question: Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.*/

import java.util.*;

public class pract6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// inputting the latter
		System.out.println("Enter latter :");
		char latter = sc.next().charAt(0);
		// chacking latter 
		if(latter == 'a' ||latter == 'e' ||latter == 'i' ||latter == 'o' ||latter == 'u'||latter == 'A' 
			||latter == 'E' ||latter == 'I' ||latter == 'O' ||latter == 'U'){
			System.out.println("The latter "+latter+" is vowel");
		}
		else{
			System.out.println("The latter "+latter+" is constant");
		}
			
	}
}