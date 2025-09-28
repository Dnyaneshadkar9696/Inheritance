// Single Inheritance Example
// One child class inherits from one parent class

// Parent Class
class Vehicle {
    protected String brand;
    protected int year;
    protected double price;
    
    // Constructor
    public Vehicle(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    
    // Methods
    public void start() {
        System.out.println(brand + " vehicle is starting...");
    }
    
    public void stop() {
        System.out.println(brand + " vehicle has stopped.");
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

// Child Class - Single Inheritance
class Car extends Vehicle {
    private int doors;
    private String fuelType;
    
    // Constructor
    public Car(String brand, int year, double price, int doors, String fuelType) {
        super(brand, year, price); // Call parent constructor
        this.doors = doors;
        this.fuelType = fuelType;
    }
    
    // Car-specific methods
    public void honk() {
        System.out.println(brand + " car is honking: Beep! Beep!");
    }
    
    public void openTrunk() {
        System.out.println("Opening the trunk of " + brand + " car.");
    }
    
    // Override parent method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("Doors: " + doors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("=== SINGLE INHERITANCE EXAMPLE ===");
        System.out.println("Car extends Vehicle (One child, one parent)\n");
        
        // Create Vehicle object
        Vehicle vehicle = new Vehicle("Generic", 2020, 15000);
        System.out.println("1. Parent Class (Vehicle):");
        vehicle.displayInfo();
        vehicle.start();
        vehicle.stop();
        System.out.println();
        
        // Create Car object
        Car car = new Car("Toyota", 2023, 25000, 4, "Petrol");
        System.out.println("2. Child Class (Car):");
        car.displayInfo();    // Overridden method
        car.start();          // Inherited method
        car.honk();           // Own method
        car.openTrunk();      // Own method
        car.stop();           // Inherited method
        System.out.println();
        
        // Demonstrating inheritance
        System.out.println("3. Inheritance Benefits:");
        System.out.println("✓ Car inherits: brand, year, price, start(), stop()");
        System.out.println("✓ Car adds: doors, fuelType, honk(), openTrunk()");
        System.out.println("✓ Car overrides: displayInfo() method");
        System.out.println("✓ Code reusability achieved!");
    }
}