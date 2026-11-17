public class Task05 {
    public static void main(String[] args) {
        int halfRows = 5;

        // Upper half of the diamond (including the middle widest row)
        for (int row = 1; row <= halfRows; row++) {
            for (int space = 1; space <= halfRows - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int row = halfRows - 1; row >= 1; row--) {
            for (int space = 1; space <= halfRows - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}