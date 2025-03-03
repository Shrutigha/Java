import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        scanner.close();
    }
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }
}


OUTPUT:
Enter a number: 10
10 is not a perfect number.
