/**
 * Java class for Calculation of Two integers.
 */
class Calculator {

    /**
     * Calculator class constructor.
     */
    protected Calculator() {

    }

    /**
     * Method for addition of Two Integers.
     * @param a Integer
     * @param b Integer
     * @return addition of two numbers
     */
    static int addition(final int a, final int b) {
        return a + b;
    }

    /**
     * Method for subtraction of Two Integers.
     * @param a Integer
     * @param b Integer
     * @return subtraction of two numbers
     */
    static int subtraction(final int a, final int b) {
        return a - b;
    }

    /**
     * Method for Multiplication of Two Integers.
     * @param a Integer
     * @param b Integer
     * @return multiplication of two numbers
     */
    static int multiplication(final int a, final int b) {
        return a * b;
    }

    /**
     * Method for Division of Two Integers.
     * @param a Integer
     * @param b Integer
     * @return division of two numbers
     */
    static int division(final int a, final int b) {
        return a / b;
    }

    /**
     * Method to find Natural log of given number.
     * @param number Natural Number
     * @return Natural log of given number
     */
    static double log(final double number) {
        double result = java.lang.Math.log(number);
        return result;
    }

}
