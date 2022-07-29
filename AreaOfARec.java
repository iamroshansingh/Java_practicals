package javaFiles;

import java.util.Scanner;

public class AreaOfARec {
	public static void main(String args[]) {
		float len,bre,area,peri;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenth : ");
		len=sc.nextFloat();
		System.out.println("Enter bre : ");
		bre=sc.nextFloat();
		area=len*bre;
		peri=2*(len+bre);
		System.out.println("area of the rectangle is : "+area);
		System.out.println("perimeter of rectrangel is : "+peri);
	}
}
