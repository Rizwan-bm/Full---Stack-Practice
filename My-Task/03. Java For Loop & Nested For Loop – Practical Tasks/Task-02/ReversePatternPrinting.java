public class ReversePatternPrinting {
    public static void main(String[] args) {
        int totalRows = 5;

        // Outer loop decreases from totalRows down to 1
        for (int row = totalRows; row >= 1; row--) {
            // Inner loop prints stars equal to the current row value
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}