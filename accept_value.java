//write a program to accept the value from user
import java.util.*;
class accept_value
{
    public static void main (String args[])
         {
          int num1,num2,res;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter frist number");
          num1=sc.nextInt();
          System.out.println("Enter second number");
          num2=sc.nextInt();
 
          res=num1+num2;
          System.out.println("The sum of num1 and num2 is "+res);


         }


}