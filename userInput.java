import java.util.Scanner;

public class userInput
{
    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);

       System.out.print("Enter a number:");

       int number = sobj.nextInt();

       System.out.println("You entered: "+number);

    }
}