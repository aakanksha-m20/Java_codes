import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a positive integer:");
        int n = sobj.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
