import java.util.Scanner;

public class FindLCM 
{    
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter two positive integers: ");
        int n1 = sobj.nextInt();
        int n2 = sobj.nextInt();

        int gcd = 0;
        int LCM;

        for(int i = 1; i <= n1 && i <= n2; i++)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                gcd = i;
            }
        }
        
        LCM = (n1 * n2) / gcd;

        System.out.println(LCM + " is LCM of " + n1 + " and " + n2);

    }   
}
