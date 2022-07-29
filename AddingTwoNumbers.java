package javaFiles;

import java.util.Scanner;

public class AddingTwoNumbers {
	public static void main (String [] args ) {
		int a ,b,sum;
		Scanner sc= new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		a=sc.nextInt();
		System.out.print("ENTER AGAIN NUMBER : ");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("The sum of the above Numbers is :  "+sum);
		
		
	}
}