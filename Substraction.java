// Simple Subtraction Program in Java
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Subtracting two numbers
        int difference = num1 - num2;

        // Displaying the result
        System.out.println("The difference is: " + difference);

        input.close();
    }
}
