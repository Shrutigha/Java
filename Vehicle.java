
class Vehicle {
    String brand;
    String model;
    int year;
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("The " + year + " " + brand + " " + model + " is driving.");
    }
}
class Car extends Vehicle {
    String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);  // Calling the parent class constructor
        this.color = color;
    }

    public void honk() {
        System.out.println("The " + color + " " + brand + " " + model + " is honking: Beep Beep!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2020, "Red");

        // Calling the drive method from the parent class
        myCar.drive();

        // Calling the honk method from the child class
        myCar.honk();
    }
}


OUTPUT:
The 2020 Toyota Corolla is driving.
The Red Toyota Corolla is honking: Beep Beep!

