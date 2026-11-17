import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double firstNumber = input.nextDouble();
            
            System.out.print("Enter the second number: ");
            double secondNumber = input.nextDouble();
            
            if (firstNumber > secondNumber) {
                System.out.println("The largest number is: " + firstNumber);
            } else if (secondNumber > firstNumber) {
                System.out.println("The largest number is: " + secondNumber);
            } else {
                System.out.println("Both numbers are equal.");
            }
        }
    }
}