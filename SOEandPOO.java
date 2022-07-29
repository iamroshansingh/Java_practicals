package javaFiles;

import java.util.Scanner;

public class SOEandPOO {

	public static void main(String[] args) {
		int n,sum=0,pro=1,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Number ");
		n=sc.nextInt();
		while(n>0) 
		{
			digit=n%10;
			if(digit%2==0) 
				sum=sum+digit;
			
			else 
				pro=pro*digit;
			
			
			n=n/10;
			
			}System.out.println(sum+"is sum");
			System.out.println(pro+"is pro ");
			

	}
	}


/*package javaFiles;

import java.util.Scanner;

public class SOEandPOO {
	public static void main(String [] args) {
		int n,sum,pro,digit;
		sum=0;
		pro=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		n=sc.nextInt();
		while(n>0) {
			digit=n%10;
			if (digit%2==0) {
				sum=sum+digit;
			}
			else {
				pro=pro*digit;
			}
			n=n/10;
			
			
		}
		System.out.println("sum is "+sum);
		System.out.println("product is "+pro);
		
	}
		
}*/