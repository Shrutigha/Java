package shruti;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Sorted TreeSet: " + numbers);
    }
}

OUTPUT:
Sorted TreeSet: [1, 3, 5, 8, 10]
