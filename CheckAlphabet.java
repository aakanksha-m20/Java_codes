import java.util.Scanner;

public class CheckAlphabet 
{
        public static void main(String[] args)
        {
            Scanner sobj = new Scanner(System.in);

            System.out.print("Enter a character: ");
            
            char c = sobj.next().charAt(0);
    
            if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            {
                System.out.println(c + " is an alphabet.");
            }
            else
            {
                System.out.println(c + " is not an alphabet.");
            }
        }
}
