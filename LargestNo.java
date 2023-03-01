import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


public class LargestNo 
{
    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);

       System.out.print("Enter a,b,c: ");

       int a = sobj.nextInt();
       int b = sobj.nextInt();
       int c = sobj.nextInt();

       if(a >= b && a >= c)
       {
         System.out.println(a + " is largest number.");
       }
       else if(b >= a && b >= c)
       {
         System.out.println(b + " is largest number.");
       }
       else
       {
         System.out.println(c + " is largest number.");
       }      
    }
        

}
