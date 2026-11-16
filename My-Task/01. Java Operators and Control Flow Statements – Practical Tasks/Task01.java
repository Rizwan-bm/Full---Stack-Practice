import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double firstNumber = input.nextDouble();
            
            System.out.print("Enter the second number: ");
            double secondNumber = input.nextDouble();
            
            System.out.println("Addition: " + (firstNumber + secondNumber));
            System.out.println("Subtraction: " + (firstNumber - secondNumber));
            System.out.println("Multiplication: " + (firstNumber * secondNumber));
            
            // Check to prevent division by zero
            if (secondNumber != 0) {
                System.out.println("Division: " + (firstNumber / secondNumber));
            } else {
                System.out.println("Division: Cannot divide by zero.");
            }
        }
    }
}