package shruti;
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> books = new ArrayDeque<>();

        // Adding books
        books.addFirst("The Great Gatsby");
        books.addLast("1984");
        books.addFirst("To Kill a Mockingbird");
        books.addLast("Moby Dick");

        System.out.println("Books in the deque: " + books);

        // Removing from both ends
        books.removeFirst();
        books.removeLast();

        System.out.println("After removing from both ends: " + books);
    }
}


OUTPUT:Books in the deque: [To Kill a Mockingbird, The Great Gatsby, 1984, Moby Dick]
After removing from both ends: [The Great Gatsby, 1984]
