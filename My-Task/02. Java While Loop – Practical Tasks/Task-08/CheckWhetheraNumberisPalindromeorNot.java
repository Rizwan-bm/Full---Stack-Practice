import java.util.Scanner;

public class CheckWhetheraNumberisPalindromeorNot {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int originalNumber = input.nextInt();
            
            int tempNumber = originalNumber;
            int reversedNumber = 0;
            
            while (tempNumber > 0) {
                int digit = tempNumber % 10;
                reversedNumber = (reversedNumber * 10) + digit;
                tempNumber /= 10;
            }
            
            if (originalNumber >= 0 && originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a palindrome number.");
            } else {
                System.out.println(originalNumber + " is NOT a palindrome number.");
            }
        }
    }
}