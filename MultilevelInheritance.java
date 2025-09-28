// Multilevel Inheritance Example
// A chain of inheritance: Grandparent → Parent → Child

// Grandparent Class
class LivingBeing {
    protected String name;
    protected int age;
    
    public LivingBeing(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void breathe() {
        System.out.println(name + " is breathing.");
    }
    
    public void grow() {
        System.out.println(name + " is growing.");
    }
    
    public void displayBasicInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Parent Class (inherits from LivingBeing)
class Animal extends LivingBeing {
    protected String species;
    protected String habitat;
    
    public Animal(String name, int age, String species, String habitat) {
        super(name, age); // Call grandparent constructor
        this.species = species;
        this.habitat = habitat;
    }
    
    public void eat() {
        System.out.println(name + " the " + species + " is eating.");
    }
    
    public void move() {
        System.out.println(name + " is moving in " + habitat + ".");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping peacefully.");
    }
    
    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo(); // Call grandparent method
        System.out.println("Species: " + species + ", Habitat: " + habitat);
    }
}

// Child Class (inherits from Animal, which inherits from LivingBeing)
class Dog extends Animal {
    private String breed;
    private String ownerName;
    
    public Dog(String name, int age, String breed, String ownerName) {
        super(name, age, "Canine", "Domestic"); // Call parent constructor
        this.breed = breed;
        this.ownerName = ownerName;
    }
    
    public void bark() {
        System.out.println(name + " the " + breed + " is barking: Woof! Woof!");
    }
    
    public void wagTail() {
        System.out.println(name + " is wagging tail happily!");
    }
    
    public void playFetch() {
        System.out.println(name + " is playing fetch with " + ownerName + ".");
    }
    
    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo(); // Call parent method (Animal)
        System.out.println("Breed: " + breed + ", Owner: " + ownerName);
    }
    
    // Method demonstrating multilevel inheritance
    public void showMultilevelInheritance() {
        System.out.println("\n--- Multilevel Inheritance in Action ---");
        breathe();       // From LivingBeing (grandparent)
        grow();          // From LivingBeing (grandparent)
        eat();           // From Animal (parent)
        move();          // From Animal (parent)
        bark();          // From Dog (own method)
        wagTail();       // From Dog (own method)
        System.out.println("All methods accessible through inheritance chain!");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("=== MULTILEVEL INHERITANCE EXAMPLE ===");
        System.out.println("Dog extends Animal extends LivingBeing\n");
        
        // Create objects at each level
        System.out.println("1. Grandparent Class (LivingBeing):");
        LivingBeing being = new LivingBeing("Generic Being", 10);
        being.displayBasicInfo();
        being.breathe();
        being.grow();
        System.out.println();
        
        System.out.println("2. Parent Class (Animal):");
        Animal animal = new Animal("Wild Tiger", 5, "Feline", "Forest");
        animal.displayBasicInfo();
        animal.breathe(); // Inherited from LivingBeing
        animal.eat();     // Own method
        animal.move();    // Own method
        System.out.println();
        
        System.out.println("3. Child Class (Dog):");
        Dog dog = new Dog("Buddy", 3, "Golden Retriever", "John");
        dog.displayBasicInfo();
        dog.showMultilevelInheritance();
        System.out.println();
        
        // Inheritance chain demonstration
        System.out.println("4. Inheritance Chain Analysis:");
        System.out.println("LivingBeing → Animal → Dog");
        System.out.println("✓ Dog inherits from Animal: eat(), move(), sleep()");
        System.out.println("✓ Dog inherits from LivingBeing: breathe(), grow()");
        System.out.println("✓ Dog has its own: bark(), wagTail(), playFetch()");
        System.out.println("✓ Total methods available to Dog: " +
                           "LivingBeing methods + Animal methods + Dog methods");
    }
}