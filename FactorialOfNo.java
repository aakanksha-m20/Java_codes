import java.util.Scanner;

public class FactorialOfNo 
{
    public static void main(String[] args)
    {
        long fact = 1;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sobj.nextInt();
    
        // shows error if the user enters a negative integer
        if (n < 0)
        {
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        }
        else 
        {
            for (int i = 1; i <= n; ++i)
            {
                fact *= i;
            }
            System.out.printf("Factorial of %d = %d", n, fact);
        }
    
    }
}
