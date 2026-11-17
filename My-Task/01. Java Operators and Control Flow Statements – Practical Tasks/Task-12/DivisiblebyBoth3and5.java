import java.util.Scanner;

public class DivisiblebyBoth3and5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " is divisible by both 3 and 5.");
            } else {
                System.out.println(number + " is NOT divisible by both 3 and 5.");
            }
        }
    }
}