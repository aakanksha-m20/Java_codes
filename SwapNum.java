import java.util.*;

public class SwapNum 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first numbers: ");
        int a = sobj.nextInt();

        System.out.print("Enter second numbers: ");
        int b = sobj.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers after swaping:"+a  + " " +b);
    }
}
