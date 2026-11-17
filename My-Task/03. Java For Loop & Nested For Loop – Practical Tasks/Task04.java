public class Task04 {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int row = 1; row <= totalRows; row++) {
            // Print leading spaces for alignment
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print(" ");
            }
            // Print odd number of stars (1, 3, 5, 7, 9)
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}