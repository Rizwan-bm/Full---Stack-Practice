import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to print its multiplication table: ");
            int number = input.nextInt();
            
            int multiplier = 1;
            while (multiplier <= 12) {
                System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
                multiplier++;
            }
        }
    }
}