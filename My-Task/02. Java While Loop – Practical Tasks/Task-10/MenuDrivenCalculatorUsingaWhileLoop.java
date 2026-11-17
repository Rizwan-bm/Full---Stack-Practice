import java.util.Scanner;

public class MenuDrivenCalculatorUsingaWhileLoop {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int choice = 0;
            
            while (choice != 5) {
                System.out.println("\n--- Calculator Menu ---");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Exit");
                System.out.print("Choose an option (1-5): ");
                choice = input.nextInt();
                
                if (choice >= 1 && choice <= 4) {
                    System.out.print("Enter first number: ");
                    double firstNumber = input.nextDouble();
                    
                    System.out.print("Enter second number: ");
                    double secondNumber = input.nextDouble();
                    
                    switch (choice) {
                        case 1 -> System.out.println("Result: " + (firstNumber + secondNumber));
                        case 2 -> System.out.println("Result: " + (firstNumber - secondNumber));
                        case 3 -> System.out.println("Result: " + (firstNumber * secondNumber));
                        case 4 -> {
                            if (secondNumber != 0) {
                                System.out.println("Result: " + (firstNumber / secondNumber));
                            } else {
                                System.out.println("Error: Cannot divide by zero.");
                            }
                        }
                    }
                } else if (choice == 5) {
                    System.out.println("Exiting calculator. Goodbye!");
                } else {
                    System.out.println("Invalid option. Please select between 1 and 5.");
                }
            }
        }
    }
}