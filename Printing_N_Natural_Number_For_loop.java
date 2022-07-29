//Printing_Nth_Natural_Number_For_loop
package javaFiles;

import java.util.Scanner;

public class Printing_N_Natural_Number_For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		i=sc.nextInt();
		for (j=1;j<=i;j++) {
			System.out.print(j+"," );
		}

	}

}
