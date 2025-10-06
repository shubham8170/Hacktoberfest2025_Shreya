// Simple Encryption and Decryption Program in Java (Caesar Cipher)
import java.util.Scanner;

public class EncryptData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter text to encrypt: ");
        String text = input.nextLine();

        System.out.print("Enter shift key (number): ");
        int key = input.nextInt();

        // Encrypt the text
        String encrypted = encrypt(text, key);
        System.out.println("Encrypted text: " + encrypted);

        // Decrypt the text
        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted text: " + decrypted);

        input.close();
    }

    // Method to encrypt text
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + key) % 26 + base);
            }
            result.append(c);
        }
        return result.toString();
    }

    // Method to decrypt text
    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - (key % 26)); // reverse shift
    }
}
