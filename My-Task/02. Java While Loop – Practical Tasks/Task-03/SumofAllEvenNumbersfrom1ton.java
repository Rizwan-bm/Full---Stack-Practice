import java.util.Scanner;

public class SumofAllEvenNumbersfrom1ton {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a positive integer (n): ");
            int limit = input.nextInt();
            
            int currentNumber = 2;
            int evenSum = 0;
            
            while (currentNumber <= limit) {
                evenSum += currentNumber;
                currentNumber += 2;
            }
            
            System.out.println("Sum of all even numbers from 1 to " + limit + " is: " + evenSum);
        }
    }
}