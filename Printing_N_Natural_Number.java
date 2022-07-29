//Nth number using while loop
package javaFiles;

import java.util.*;

public class Printing_N_Natural_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		i=sc.nextInt();
		j=1;
		while(j<=i) {
			System.out.print(j+"," );
			j+=1;
		}

	}

}
