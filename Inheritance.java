class A{
    // These should be instance variables (class level), not local variables
    protected int a = 10;  // protected allows access in subclasses
    protected int b = 20;  // protected allows access in subclasses
    
    void show(){
        int c = a + b;
        System.out.println("The sum is: " + c);
    }
}
class B extends A{
    void display(){
        System.out.println("This is the display method of class B");
        int d = 9;
        int f = a + b + d;  // Now this will work because a and b are inherited
        System.out.println("The sum is: " + f);
    }
}





public class Inheritance {
    public static void main(String[] args) {
        System.out.println("=== Inheritance Example ===");
        
        // Creating object of parent class A
        A objA = new A();
        System.out.println("1. Parent Class A:");
        objA.show();
        
        System.out.println();
        
        // Creating object of child class B
        B objB = new B();
        System.out.println("Calling show() from inherited class B:");
        objB.show();  // B inherits this method from A
        
        System.out.println("Calling display() from class B:");
        objB.display();  // B's own method
        
        System.out.println();
        System.out.println("Values accessible in class B:");
        System.out.println("a = " + objB.a);  // Inherited variable
        System.out.println("b = " + objB.b);  // Inherited variable
    }
}
