import java.util.Scanner;

public class SimpleCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Return NaN if division by zero
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        // Ask user for the operation
        System.out.println("Choose an operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result = 0;

        // Perform operation based on user input
        switch (operator) {
            case '+' -> result = add(num1, num2);
            case '-' -> result = subtract(num1, num2);
            case '*' -> result = multiply(num1, num2);
            case '/' -> result = divide(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                return;
            }
        }

        // Display the result
        System.out.println("The result is: " + result);
    }
}