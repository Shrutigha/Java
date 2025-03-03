package shruti;
import java.util.Vector;

class Student {
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class VectorExample {
    public static void main(String[] args) {
        Vector<Student> students = new Vector<>();

        students.add(new Student("Alice", 20, "Computer Science"));
        students.add(new Student("Bob", 22, "Electronics"));
        students.add(new Student("Charlie", 21, "Mechanical"));

        for (Student student : students) {
            student.display();
        }
    }
}



OUTPUT:
Name: Alice, Age: 20, Course: Computer Science
Name: Bob, Age: 22, Course: Electronics
Name: Charlie, Age: 21, Course: Mechanical
