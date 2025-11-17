import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            int result = 100 / num;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            System.out.println("Program has ended. Closing scanner...");
            scanner.close();
        }
    }
}
