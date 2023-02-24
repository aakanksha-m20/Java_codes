import java.util.Scanner;

public class Quotient_remainder
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Divident: ");
        int Divident = sobj.nextInt();
 
        System.out.print("Enter Divisor: ");
        int Divisor = sobj.nextInt();

        float Quotient = Divident / Divisor;

        int Remainder = Divident % Divisor;

        System.out.println("Quotient: "+Quotient +" Remainder: "+Remainder);

    }
}
