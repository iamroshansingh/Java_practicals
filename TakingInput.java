import java.io.*;
class TakingInput{
	public static void main(String args[])throws IOException
{	int a,b,sum;

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Wnter numbers for a ");
	a=Integer.parseInt(br.readLine());
	System.out.println("Write number for b  ");
	b=Integer.parseInt(br.readLine());
	sum=a+b;
	System.out.println("sum of a and b is : " +sum);

	
	}
}