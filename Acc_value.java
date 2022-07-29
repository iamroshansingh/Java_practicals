package javaFiles;

import java.util.Scanner;

/*public class Acc_value {
	public static void main(String args[])
	{
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  Number\n");
		num1=sc.nextInt();
		System.out.print("Enter another number\n");
		num2=sc.nextInt();
		result=num1+num2;
		System.out.println("The result of two numberis " +result );
	}

}
*/
public class Acc_value{
	public static void main (String args[])
	{
		String name;
		char gen;
		String comm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		comm=sc.nextLine();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enetr gender");
		gen=sc.next().charAt(0);
		System.out.println("Enterd Name = "+name);
		System.out.println("Enterd gender = "+gen);
		System.out.println("enterd comment = "+ comm);
		
	}
}