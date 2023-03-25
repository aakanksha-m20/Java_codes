import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i = 1, firstTerm = 0, secondTerm = 1;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter expected series :");
        int n = sobj.nextInt();

        System.out.println("Fibonacci Series till " + n + " terms:");

        sobj.close();

        while (i <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }
}