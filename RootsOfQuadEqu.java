import java.util.Scanner;
import java.math.*;

public class RootsOfQuadEqu 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        double root1,root2;

        System.out.println("Enter coefficients a,b,c: ");
 
        double a = sobj.nextDouble();
        double b = sobj.nextDouble();
        double c = sobj.nextDouble();    

        double discriminant = b*b - 4*a*c;

        if(discriminant > 0)
        {
            root1 = (- b + Math.sqrt(discriminant)) / (2*a);
            root2 = (- b - Math.sqrt(discriminant)) / (2*a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if(discriminant == 0)
        {
            root1 = root2 = - b / (2*a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else
        {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
