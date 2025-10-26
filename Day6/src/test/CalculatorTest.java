import study.Calculator;
import study.WrongOperatorException;

public class CalculatorTest {
    public static void main(String[] args) {
        try {
            int result1 = Calculator.calculate(10, 5, "+");
            System.out.println("Result: " + result1);

            int result2 = Calculator.calculate(10, 3, "%");
            System.out.println("Result: " + result2);

            // Invalid operator -> throws custom exception
            int result3 = Calculator.calculate(5, 2, "#");
            System.out.println("Result: " + result3);

        } catch (WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        }
    }
}


