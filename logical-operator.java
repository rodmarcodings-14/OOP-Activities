import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Addition is " + (num1 + num2));
        System.out.println("Subtraction is " + (num1 - num2));
        System.out.println("Multiplication is " + (num1 * num2));

        if (num2 != 0 && num2 > -Double.MAX_VALUE) {
            System.out.println("Division is " + (num1 / num2));
        } else {
            System.out.println("Division is not possible");
        }

        scanner.close();
    }
}
