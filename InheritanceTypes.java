// Comprehensive Example of All Inheritance Types in Java

// ==================== 1. SINGLE INHERITANCE ====================
// One child class inherits from one parent class

class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Single Inheritance: Dog extends Animal
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    public void bark() {
        System.out.println(name + " the " + breed + " is barking: Woof!");
    }
}

// ==================== 2. MULTILEVEL INHERITANCE ====================
// A chain of inheritance: A → B → C

// Multilevel: Puppy extends Dog, Dog extends Animal
class Puppy extends Dog {
    private boolean isPlayful;
    
    public Puppy(String name, int age, String breed, boolean isPlayful) {
        super(name, age, breed);
        this.isPlayful = isPlayful;
    }
    
    public void play() {
        if (isPlayful) {
            System.out.println(name + " the puppy is playing happily!");
        } else {
            System.out.println(name + " the puppy is tired.");
        }
    }
    
    // Can access methods from both Dog and Animal classes
    public void showInheritance() {
        eat();    // From Animal (grandparent)
        bark();   // From Dog (parent)
        play();   // Own method
    }
}

// ==================== 3. HIERARCHICAL INHERITANCE ====================
// Multiple classes inherit from the same parent class

class Cat extends Animal {
    private String furColor;
    
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    
    public void meow() {
        System.out.println(name + " with " + furColor + " fur is meowing: Meow!");
    }
}

class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    
    public void chirp() {
        System.out.println(name + " is chirping: Tweet tweet!");
    }
    
    public void fly() {
        if (canFly) {
            System.out.println(name + " is flying high!");
        } else {
            System.out.println(name + " cannot fly.");
        }
    }
}

// ==================== 4. MULTIPLE INHERITANCE (NOT SUPPORTED) ====================
// This would cause compilation error in Java:
/*
class Fish {
    public void swim() {
        System.out.println("Swimming...");
    }
}

class Mammal {
    public void walk() {
        System.out.println("Walking...");
    }
}

// This is NOT allowed in Java - Multiple Inheritance
class Dolphin extends Fish, Mammal {  // COMPILATION ERROR!
    // Cannot extend multiple classes
}
*/

// ==================== ALTERNATIVE: INTERFACES (Multiple Implementation) ====================
// Java allows implementing multiple interfaces (which is like multiple inheritance)

interface Swimmable {
    void swim();
}

interface Walkable {
    void walk();
}

// This IS allowed - implementing multiple interfaces
class Dolphin extends Animal implements Swimmable, Walkable {
    public Dolphin(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void swim() {
        System.out.println(name + " the dolphin is swimming gracefully!");
    }
    
    @Override
    public void walk() {
        System.out.println(name + " the dolphin cannot walk on land!");
    }
}

public class InheritanceTypes {
    public static void main(String[] args) {
        System.out.println("=== TYPES OF INHERITANCE IN JAVA ===\n");
        
        // 1. SINGLE INHERITANCE
        System.out.println("1. SINGLE INHERITANCE:");
        System.out.println("   Dog extends Animal");
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.eat();   // Inherited from Animal
        myDog.bark();  // Own method
        System.out.println();
        
        // 2. MULTILEVEL INHERITANCE
        System.out.println("2. MULTILEVEL INHERITANCE:");
        System.out.println("   Puppy extends Dog extends Animal");
        Puppy myPuppy = new Puppy("Charlie", 1, "Labrador", true);
        myPuppy.showInheritance(); // Uses methods from all levels
        System.out.println();
        
        // 3. HIERARCHICAL INHERITANCE
        System.out.println("3. HIERARCHICAL INHERITANCE:");
        System.out.println("   Dog, Cat, Bird all extend Animal");
        
        Cat myCat = new Cat("Whiskers", 2, "black");
        myCat.eat();   // Inherited from Animal
        myCat.meow();  // Own method
        
        Bird myBird = new Bird("Tweety", 1, true);
        myBird.eat();   // Inherited from Animal
        myBird.chirp(); // Own method
        myBird.fly();   // Own method
        System.out.println();
        
        // 4. MULTIPLE IMPLEMENTATION (Alternative to Multiple Inheritance)
        System.out.println("4. MULTIPLE INTERFACE IMPLEMENTATION:");
        System.out.println("   Dolphin extends Animal implements Swimmable, Walkable");
        Dolphin myDolphin = new Dolphin("Flipper", 5);
        myDolphin.eat();  // From Animal
        myDolphin.swim(); // From Swimmable interface
        myDolphin.walk(); // From Walkable interface
        System.out.println();
        
        // SUMMARY
        System.out.println("=== INHERITANCE TYPES SUMMARY ===");
        System.out.println("✅ Single Inheritance: One class extends one parent");
        System.out.println("✅ Multilevel Inheritance: Chain of inheritance (A→B→C)");
        System.out.println("✅ Hierarchical Inheritance: Multiple classes extend same parent");
        System.out.println("❌ Multiple Inheritance: NOT supported with classes");
        System.out.println("✅ Multiple Implementation: Supported with interfaces");
        System.out.println();
        System.out.println("Why Multiple Inheritance is not allowed:");
        System.out.println("- Diamond Problem: Ambiguity when multiple parents have same method");
        System.out.println("- Java uses interfaces to achieve multiple inheritance behavior");
    }
}