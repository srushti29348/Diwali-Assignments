package study;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /, %): ");
            String op = sc.next();

            int result = Calculator.calculate(num1, num2, op);
            System.out.println("Result: " + result);

        } catch (WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();
        }
    }
}