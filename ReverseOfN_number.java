package javaFiles;
import java.util.*;

public class ReverseOfN_number {
	public static void main(String[] args){
		int i,j;
		j=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		i=sc.nextInt();
		while(i>0) {
			j=(j*0)+i%10;
			i=i/10;
			System.out.print(j);
			
		}
	}
}
