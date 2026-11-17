import java.util.Scanner;

public class SimpleCalculatorUsingswitchStatement {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double firstNumber = input.nextDouble();
            
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = input.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double secondNumber = input.nextDouble();
            
            switch (operator) {
                case '+' -> System.out.println("Result: " + (firstNumber + secondNumber));
                case '-' -> System.out.println("Result: " + (firstNumber - secondNumber));
                case '*' -> System.out.println("Result: " + (firstNumber * secondNumber));
                case '/' -> {
                    if (secondNumber != 0) {
                        System.out.println("Result: " + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                }
                default -> System.out.println("Invalid operator entered.");
            }
        }
    }
}