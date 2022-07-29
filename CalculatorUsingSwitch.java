package javaFiles;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum,result,ch;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please choose one of them for calculation");
		System.out.println("1 :  for ADDITION");
		System.out.println("2 :  for SUBTRACTION");
		System.out.println("3 :  for MULTIPLACTION");
		System.out.println("4 :  for DIVISION");
		System.out.println("5 :  for MINIMUM");
		System.out.println("6 :  for MAXIMUM");
		System.out.print("Enter Your Choice : ");
		ch=sc.nextInt();
		System.out.println("your choice is "+ch);
		switch(ch) {
		case 1:
			System.out.println("Enter Num 1.");
			a=sc.nextInt();
			System.out.println("Enter Num 2.");
			b=sc.nextInt();
			sum=a+b;
			System.out.println(sum+" is the result of a+b ");
			break;
		case 2:
			System.out.println("Enter Num 1.");
			a=sc.nextInt();
			System.out.println("Enter Num 2.");
			b=sc.nextInt();
			result=a-b;
			System.out.println(result+" is the result of a-b ");
			break;
		case 3:
			System.out.println("Enter Num 1.");
			a=sc.nextInt();
			System.out.println("Enter Num 2.");
			b=sc.nextInt();
			result=a*b;
			System.out.println(result +" is the result of a*b ");
			break;
		 case 4:
			System.out.println("Enter Num 1.");
			a=sc.nextInt();
			System.out.println("Enter Num 2.");
			b=sc.nextInt();
			result=a/b;
			System.out.println(result+" is the result of a+b ");
			break;
		 case 5:
			 System.out.println("Enter Num 1.");
				a=sc.nextInt();
				System.out.println("Enter Num 2.");
				b=sc.nextInt();
				if(a>b)
					result=b;
				else
					result=a;
			System.out.println(result+" is minimum a between b ");
			break;
		 case 6:
			 System.out.println("Enter Num 1.");
				a=sc.nextInt();
				System.out.println("Enter Num 2.");
				b=sc.nextInt();
				if(a>b)
					result=a;
				else
					result=b;
			System.out.println(result+" is maximum a between b ");
			break;
		default :
			System.out.println("This is an invalid choice please restart the program ");
			
			
		}
	

	}

}
