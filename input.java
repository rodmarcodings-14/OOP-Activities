import java.util.Scanner;

class Circle {
    void getArea(double radius) {
        double PI = 3.14;
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        circle.getArea(radius);
        scanner.close();
    }
}

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "12345";
        String enteredPassword;
        int attempts = 0;

        do {
            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();

            if (!enteredPassword.equals(password)) {
                System.out.println("Wrong password");
                attempts++;
            }

            if (attempts == 3) {
                System.out.println("Too many attempts!");
                break;
            }
        } while (!enteredPassword.equals(password));

        if (enteredPassword.equals(password)) {
            System.out.println("Password accepted");
        }

        scanner.close();
    }
}
