// Simple Division Program in Java
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the numerator: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the denominator: ");
        double num2 = input.nextDouble();

        // Check if denominator is zero
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Performing division
            double result = num1 / num2;

            // Displaying the result
            System.out.println("The result is: " + result);
        }

        input.close();
    }
}
