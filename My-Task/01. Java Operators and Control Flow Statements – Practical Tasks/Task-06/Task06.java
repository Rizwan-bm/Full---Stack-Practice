import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the student's marks (0-100): ");
            double marks = input.nextDouble();
            
            if (marks >= 40 && marks <= 100) {
                System.out.println("Result: Pass");
            } else if (marks >= 0 && marks < 40) {
                System.out.println("Result: Fail");
            } else {
                System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
            }
        }
    }
}