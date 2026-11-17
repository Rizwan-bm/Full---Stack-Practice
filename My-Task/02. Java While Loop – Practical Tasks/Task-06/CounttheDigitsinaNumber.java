import java.util.Scanner;

public class CounttheDigitsinaNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            long number = input.nextLong();
            
            long tempNumber = Math.abs(number);
            int digitCount = 0;
            
            if (tempNumber == 0) {
                digitCount = 1;
            } else {
                while (tempNumber > 0) {
                    tempNumber /= 10;
                    digitCount++;
                }
            }
            
            System.out.println("Total number of digits: " + digitCount);
        }
    }
}