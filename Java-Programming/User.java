public class User{
    public static void main(String[] args) {
        int date = 5;
        switch (date) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            default -> System.out.println("invalid date");
        }
    }
}