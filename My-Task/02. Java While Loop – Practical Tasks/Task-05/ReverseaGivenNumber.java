import java.util.Scanner;

public class ReverseaGivenNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer to reverse: ");
            int originalNumber = input.nextInt();
            
            int number = Math.abs(originalNumber);
            int reversedNumber = 0;
            
            while (number > 0) {
                int lastDigit = number % 10;
                reversedNumber = (reversedNumber * 10) + lastDigit;
                number /= 10;
            }
            
            if (originalNumber < 0) {
                reversedNumber = -reversedNumber;
            }
            
            System.out.println("Reversed number: " + reversedNumber);
        }
    }
}