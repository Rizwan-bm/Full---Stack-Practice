
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter password: ");
        int password = input.nextInt();
        while (true) {
            System.out.print("Enter password: ");
            int enteredPassword = input.nextInt();
            if (enteredPassword == password) {
                System.out.println("Password correct!");
                break;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        }
    }
}