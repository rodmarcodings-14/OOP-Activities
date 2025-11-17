import java.util.Scanner;

class Calculator {
    int divide(int number) {
        return 100 / number;
    }
}

public class ExceptionExample extends Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExceptionExample example = new ExceptionExample();

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int result = example.divide(num);
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
