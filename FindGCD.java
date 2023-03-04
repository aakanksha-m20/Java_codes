import java.util.Scanner;

public class FindGCD
{
    public static void main(String[] args) 
    {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        int n1 = sobj.nextInt();
        int n2 = sobj.nextInt();

        int gcd = 0;

        for(int i = 1; i <= n1 && i <= n2; i++)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                gcd = i;
            }
        }

        System.out.println(gcd + " is G.C.D of " + n1 + " and " + n2);

    }   
} 