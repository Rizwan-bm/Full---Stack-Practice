import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of terms (n): ");
            int terms = input.nextInt();
            
            if (terms <= 0) {
                System.out.println("Please enter a positive number of terms.");
            } else {
                int firstTerm = 0;
                int secondTerm = 1;
                int count = 1;
                
                System.out.print("Fibonacci Series: ");
                while (count <= terms) {
                    System.out.print(firstTerm + " ");
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                    count++;
                }
                System.out.println();
            }
        }
    }
}