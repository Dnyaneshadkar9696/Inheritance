// A simple class that shows encapsulation
class Student {
    // 1. Make variables private (data hiding)
    private String name;
    private int age;

    // 2. Provide public "getter" and "setter" methods
    // Getter method to read the name
    public String getName() {
        return name;
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age (with validation)
    public void setAge(int age) {
        if(age > 0) { // validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

// Main class to test encapsulation
public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        // student class object s1

        // We cannot directly access private variables like this:
        // s1.age = 20;  ❌ (Compilation error)

        // Instead, we use setter methods
        s1.setName("Anisha");
        s1.setAge(21);

        // To read data, we use getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        // Try setting invalid age
        s1.setAge(-5); // Will print "Age must be positive!"
    }
}
