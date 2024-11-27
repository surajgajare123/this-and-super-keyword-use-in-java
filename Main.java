class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int numWheels;

    public Car(String brand, int numWheels) {
        super(brand); // Calls the constructor of the parent class (Vehicle)
        this.numWheels = numWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls the displayInfo() method of the parent class
        System.out.println("Number of Wheels: " + numWheels);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("mahindra", 2);
        myCar.displayInfo();
    }
}
