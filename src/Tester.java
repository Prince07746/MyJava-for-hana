// Author: Hana Debay
// The ArithmeticOperators class provides basic arithmetic operations such as
// addition,subtraction, multiplication, and division.

class ArithmeticOperators {

    /**
     * Adds two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the sum of num1 and num2
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the result of num1 minus num2
     */
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the product of num1 and num2
     */
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides the first integer by the second.
     * Assumes the second integer is not zero.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the result of num1 divided by num2
     */
    public int div(int num1, int num2) {
        return num1 / num2;
    }
}
/**
 * The Tester class is responsible for testing the ArithmeticOperators class by invoking its
 * methods and printing the results.

 * Author: Hana Debay
 */
public class Tester {
    public static void main(String[] args) {
        // Create an ArithmeticOperators object
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();

        // Test sum method
        System.out.println("Sum: " + arithmeticOperators.sum(10, 5));

        // Test sub method
        System.out.println("Subtraction: " + arithmeticOperators.sub(10, 5));

        // Test mul method
        System.out.println("Multiplication: " + arithmeticOperators.mul(10, 5));

        // Test div method
        System.out.println("Division: " + arithmeticOperators.div(10, 5));
    }
}


