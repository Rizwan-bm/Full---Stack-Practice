public class PrintAllOddNumbersBetween1and50 {
    public static void main(String[] args) {
        int number = 1;

        System.out.println("Odd numbers between 1 and 50:");
        while (number <= 50) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
            number++;
        }
        System.out.println();
    }
}