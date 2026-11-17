public class Task01 {
    public static void main(String[] args) {
        int totalRows = 5;

        // Outer loop controls the number of rows
        for (int row = 1; row <= totalRows; row++) {
            // Inner loop prints stars equal to the current row number
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}