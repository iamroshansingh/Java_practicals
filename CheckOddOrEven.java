// To finde the number is odd or even 
package javaFiles;

import java.util.Scanner;

public class CheckOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number ");
		a=sc.nextInt();
		if (a % 2==0) {
			System.out.println( a+ " is an even number.");
			
		}
		else {
			System.out.println(a +" is an odd number");
			
		}
		
		

	}

}
