// Program to Check if a Number is Odd in Java
import java.util.Scanner;

public class OddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Checking if the number is odd
        if (num % 2 != 0) {
            System.out.println(num + " is an odd number.");
        } else {
            System.out.println(num + " is not an odd number (it's even).");
        }

        input.close();
    }
}
