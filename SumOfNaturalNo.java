import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {

        int sum = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sobj.nextInt();

        sobj.close();

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
