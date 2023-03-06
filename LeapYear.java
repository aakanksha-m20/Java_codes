import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args)
    {

        Scanner sobj = new Scanner(System.in);
     
        System.out.print("Enter year: ");  
        int year = sobj.nextInt();
        
        // leap year if perfectly divisible by 400
       if (year % 400 == 0) 
       {
         System.out.println(year + " is a leap year.");
       }
       // not a leap year if divisible by 100
       else if (year % 100 == 0)   // but if not divisible by 400 this step runs
       {
         System.out.println(year + " is not a leap year.");
       }
       // runs this step if not divisible by 100
       else if (year % 4 == 0)     // but leap year divisible by 4
       {
         System.out.println(year + " is a leap year.");
       }
       // all other years are not leap years
       else 
       {
         System.out.println(year + " is not a leap year.");
       }
    }
}
