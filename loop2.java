public class loop2  //pattern of *****
{
    public static void main (String[] args){
        int i,j;
        for (i=1;i<=5;i++){
            for (j=1;j<=5;j++){//when i am trying to j<=i result is different
                System.out.print("*");
            }
        System.out.print("\n");
        }
    }
}