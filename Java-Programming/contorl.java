public class contorl {
    public static void main(String[] args) {
        int number = 100;

        // If-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop
        int count = 1;
        while (count <= 5) {
            System.out.println("While loop iteration: " + count);
            count++;
        }

        // Do-while loop
        int doCount = 1;
        do {
            System.out.println("Do-while loop iteration: " + doCount);
            doCount++;
        } while (doCount <= 5);
    }
}