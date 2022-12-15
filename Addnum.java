import java.util.Scanner;
import java.math.*;

public class Addnum 
{
   public static void main(String[] args)
   {
      Scanner sobj = new Scanner(System.in);

      System.out.print("Enter two numbers: \n");

      int First = sobj.nextInt();
      int Second = sobj.nextInt();

      int sum = First + Second;

      System.out.println("Addition of two numbers is: "+sum);

   }  
}
