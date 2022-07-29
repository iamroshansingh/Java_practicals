package javaFiles;
import java.util.*;

public class SOD {
	/*public static void main(String[] args) {
		int i,sod=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any number : ");
		i=sc.nextInt();
		while(i>0) {
			sod =sod+i%10;
			i=i/10;
			}
		System.out.print(i);
		
		
	
	}
}
*/
/*	public static void main(String [] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
			
		}
		System.out.println(sum);
		
	}

}*/

	public static void main(String[] args) {
		int a,b;
		a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be added ");
		b=sc.nextInt();
		while (b>0) {
			a=a+b%10;
			b=b/10;
			
		}
		System.out.println("sum is :"+a);
		
	}
}