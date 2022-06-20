//WAP Accept selling price and cost price from the user and display profit or loss.
import java.utill.*;
class ProfitLoss
{ 
 public static void main(String args[]);
 { 
   Double Mrp , Sp;
   Scanner sc=new Scanner(System.in);
   System.out.println ("Please enter the MRP of Product");
   Mrp=sc.nextDouble();
   System.out.println("please enter the selling price of Product");
   Sp=sc.nextDouble();
   if (Mrp > Sp)
      { System.out.println("Mrp is gratter Then Sp it is LOSS for you");}
    else
      {System.out.println("SP is grater then Mrp it is  Profig");}
   
 }
}
//WAP to accept a no from the user and if no is positive than find oput the square.
//WAP to accept a no from user and check it is even or odd