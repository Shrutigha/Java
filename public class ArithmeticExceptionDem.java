public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 5;

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}



OUTPUT: Result: 2