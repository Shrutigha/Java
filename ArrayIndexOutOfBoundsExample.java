package shruti;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array
        int[] arr = {10, 20, 30, 40, 50};
        
        try {
            // Ask the user for an index
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();
            
            // Attempt to access the array at the given index
            System.out.println("Value at index " + index + ": " + arr[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds! Please enter a valid index (0-4).");
            
        } catch (Exception e) {
            System.out.println("Error: Invalid input! Please enter an integer.");
            
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}


OUTPUT:Enter the index to access: 2
Value at index 2: 30
Program execution completed.
