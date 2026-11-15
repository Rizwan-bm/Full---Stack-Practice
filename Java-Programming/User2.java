import java.util.Scanner;

public class User2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("enter the number");
int a = input.nextInt();


switch (a) {
    case 1 -> System.out.println("monday");
    case 2 -> System.out.println("friday");
    default -> System.out.println("error");
}
}
}