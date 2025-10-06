// Program to Hash Data Using SHA-256 in Java
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter data to hash: ");
        String data = input.nextLine();

        try {
            // Get SHA-256 MessageDigest instance
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Hash the input data
            byte[] hashBytes = digest.digest(data.getBytes());

            // Convert byte array to hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // Display the hashed data
            System.out.println("SHA-256 Hash: " + hexString.toString());

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: SHA-256 algorithm not found.");
        }

        input.close();
    }
}
