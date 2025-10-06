// Program to Generate a Random Number in Java
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Create Random object
        Random rand = new Random();

        // Generate a random number between 0 and 99
        int randomNum = rand.nextInt(100);

        // Display the random number
        System.out.println("Random number (0–99): " + randomNum);
    }
}
