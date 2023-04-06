import java.util.Scanner;

public class CountDigInNum {

    public static void main(String[] args) {

        int count = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sobj.nextInt();

        while (n != 0) {

            n = n / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}