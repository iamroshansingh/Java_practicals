package javaFiles;

import java.util.Scanner;

public class CalculatorIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome This is a Calculater");
		System.out.println("Please make a choice for further ");
		System.out.println("1.Addition " );
		System.out.println("2.Subtraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division ");
		System.out.println("Exit");
		System.out.println("Enter the choice \n like 1 for add etc.");
		choice=sc.nextInt();
			if (choice==1) {
			System.out.println("Enter Number 1 :");
			a=sc.nextInt();
			System.out.println("Enter Number 2 :");
			b=sc.nextInt();
			c=a+b;
			System.out.println("Total is : "+c);
			
		}
		else if (choice==2) {
			System.out.println("Enter Number 1: ");
			a=sc.nextInt();
			System.out.println("Enter Number 2: ");
			b=sc.nextInt();
			c=a-b;
			System.out.println("Total is : "+c);
		}
		
		else if (choice==3) {
			System.out.println("Enter Number 1 :");
			a=sc.nextInt();
			System.out.println("Enter Number 2 : " );
			b=sc.nextInt();
			c=a*b;
			System.out.println("Result is : "+c);
		}
		
		else if (choice==4) {
			System.out.println("Enter Number 1 : ");
			a=sc.nextInt();
			System.out.println("Enter Number 2 : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("result is : "+c);
		}
		else {System.out.println("Thanks for yousing ");
		
		}
		
		

	}

}
