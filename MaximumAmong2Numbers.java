package javaFiles;

import java.util.Scanner;

public class MaximumAmong2Numbers {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.1");
		a=sc.nextInt();
		System.out.println("Enter No.2");
		b=sc.nextInt();
		if(a<b) {
			System.out.println(b+" Is the max betweent a & b");
			
		}
		else if (a>b) {
			System.out.println(a+ " is max between a & b");
			
		}
		else {
			System.out.println("a and b are equal");
		}
		
		
		// TODO Auto-generated method stub

	}

}
