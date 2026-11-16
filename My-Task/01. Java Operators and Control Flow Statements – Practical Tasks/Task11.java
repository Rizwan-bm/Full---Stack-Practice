import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a single alphabet character: ");
            char character = input.next().charAt(0);
            char lowerChar = Character.toLowerCase(character);
            
            if (lowerChar >= 'a' && lowerChar <= 'z') {
                if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                    System.out.println(character + " is a vowel.");
                } else {
                    System.out.println(character + " is a consonant.");
                }
            } else {
                System.out.println("Invalid input. Please enter an alphabet letter.");
            }
        }
    }
}