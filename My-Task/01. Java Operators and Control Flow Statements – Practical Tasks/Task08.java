import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter marks (0-100): ");
            int marks = input.nextInt();
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered.");
            } else if (marks >= 75) {
                System.out.println("Grade: A");
            } else if (marks >= 65) {
                System.out.println("Grade: B");
            } else if (marks >= 55) {
                System.out.println("Grade: C");
            } else if (marks >= 40) {
                System.out.println("Grade: S");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}