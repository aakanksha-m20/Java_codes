import java.util.*;

public class AsciiValue 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sobj.next().charAt(0);
        
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

    }
}
