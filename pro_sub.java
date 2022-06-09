//WAP to accept student name, rollno , marks of 5 subject calculate Percentage and display the output 
import java.util.*;
class pro_sub
{
   public static void main(String args[])
   {
    String name;
    int roll_num;
    int sub1,sub2,sub3,sub4,sub5,per;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name ");
    name=sc.nextLine();
    System.out.println("enter your Roll no ");
    roll_num=sc.nextInt();
    System.out.println("Enter number of sub1 ");
    sub1=sc.nextInt();
    System.out.println("Enter number of sub2 ");
    sub2=sc.nextInt();
    System.out.println("Enter number of sub3 ");
    sub3=sc.nextInt();
    System.out.println("Enter number of sub4 ");
    sub4=sc.nextInt();
    System.out.println("Enter number of sub5 ");
    sub5=sc.nextInt();
    
    per=((sub1+sub2+sub3+sub4+sub5)*100)/500;

    System.out.println("Your Name Is "+ name);
    System.out.println("Your Roll no Is "+ roll_num);
    System.out.println("the percentage of 5 subjects is "+ per);

    


   }
}