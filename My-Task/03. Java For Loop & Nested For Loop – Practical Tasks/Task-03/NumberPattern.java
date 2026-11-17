public class NumberPattern {
    public static void main(String[] args) {
        int totalRows = 5;

        // Outer loop controls each row
        for (int row = 1; row <= totalRows; row++) {
            // Inner loop prints numbers from 1 up to the current row number
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}