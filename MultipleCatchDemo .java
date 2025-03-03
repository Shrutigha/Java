package shruti;
public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            // Example 1: Arithmetic Exception
            int a = 10, b = 2;
            int result = a / b;  
            
            // Example 2: ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // Accessing out-of-bounds index
            
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
        System.out.println("Program execution continues after try-catch-finally.");
    }
}

OUTPUT:Caught ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
This is the finally block. It always executes.
Program execution continues after try-catch-finally.
