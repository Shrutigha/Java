
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " says: Hello, I am " + age + " years old.");
    }
}

// Child class
class Student extends Person {
    String grade;

    // Constructor for Student class
    public Student(String name, int age, String grade) {
        super(name, age);  // Calling the parent class constructor
        this.grade = grade;
    }
    public void study() {
        System.out.println(name + " is studying in grade " + grade + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student("Alice", 20, "A");

        // Calling the speak method from the parent class
        student.speak();

        // Calling the study method from the child class
        student.study();
    }
}


OUTPUT:
Alice says: Hello, I am 20 years old.
Alice is studying in grade A.