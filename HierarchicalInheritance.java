// Hierarchical Inheritance Example
// Multiple child classes inherit from the same parent class

// Parent Class
class Shape {
    protected String color;
    protected double area;
    
    public Shape(String color) {
        this.color = color;
        this.area = 0.0;
    }
    
    public void displayColor() {
        System.out.println("Shape color: " + color);
    }
    
    public void displayArea() {
        System.out.println("Area: " + area + " square units");
    }
    
    // Method to be overridden by child classes
    public void calculateArea() {
        System.out.println("Area calculation method not implemented");
    }
    
    public void draw() {
        System.out.println("Drawing a " + color + " shape");
    }
}

// Child Class 1 - Circle
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color); // Call parent constructor
        this.radius = radius;
        calculateArea(); // Calculate area upon creation
    }
    
    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
    
    public void rollCircle() {
        System.out.println("The " + color + " circle is rolling!");
    }
}

// Child Class 2 - Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color); // Call parent constructor
        this.length = length;
        this.width = width;
        calculateArea(); // Calculate area upon creation
    }
    
    @Override
    public void calculateArea() {
        area = length * width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle " + length + "x" + width);
    }
    
    public void foldRectangle() {
        System.out.println("Folding the " + color + " rectangle!");
    }
}

// Child Class 3 - Triangle
class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(String color, double base, double height) {
        super(color); // Call parent constructor
        this.base = base;
        this.height = height;
        calculateArea(); // Calculate area upon creation
    }
    
    @Override
    public void calculateArea() {
        area = 0.5 * base * height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " triangle with base " + base + 
                          " and height " + height);
    }
    
    public void pointTriangle() {
        System.out.println("The " + color + " triangle is pointing upward!");
    }
}

// Child Class 4 - Square (special case of Rectangle)
class Square extends Shape {
    private double side;
    
    public Square(String color, double side) {
        super(color); // Call parent constructor
        this.side = side;
        calculateArea(); // Calculate area upon creation
    }
    
    @Override
    public void calculateArea() {
        area = side * side;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " square with side " + side);
    }
    
    public void rotateSquare() {
        System.out.println("Rotating the " + color + " square!");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("=== HIERARCHICAL INHERITANCE EXAMPLE ===");
        System.out.println("Circle, Rectangle, Triangle, Square all extend Shape\n");
        
        // Create different shapes (all inherit from Shape)
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 10.0, 6.0);
        Triangle triangle = new Triangle("Green", 8.0, 12.0);
        Square square = new Square("Yellow", 4.0);
        
        // Array of shapes to demonstrate polymorphism
        Shape[] shapes = {circle, rectangle, triangle, square};
        
        System.out.println("1. All shapes inherit common properties and methods:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\n--- Shape " + (i + 1) + " ---");
            shapes[i].displayColor();    // Inherited method
            shapes[i].calculateArea();   // Overridden method
            shapes[i].displayArea();     // Inherited method
            shapes[i].draw();           // Overridden method
        }
        
        System.out.println("\n2. Each shape has its own specific methods:");
        circle.rollCircle();         // Circle-specific method
        rectangle.foldRectangle();   // Rectangle-specific method
        triangle.pointTriangle();    // Triangle-specific method
        square.rotateSquare();       // Square-specific method
        
        System.out.println("\n3. Hierarchical Inheritance Benefits:");
        System.out.println("✓ All shapes share common properties: color, area");
        System.out.println("✓ All shapes share common methods: displayColor(), displayArea()");
        System.out.println("✓ Each shape provides its own implementation of calculateArea()");
        System.out.println("✓ Each shape can have additional unique methods");
        System.out.println("✓ Code reusability: Common functionality in parent class");
        
        System.out.println("\n4. Inheritance Structure:");
        System.out.println("           Shape");
        System.out.println("     ┌─────┼─────┼─────┐");
        System.out.println("  Circle Rectangle Triangle Square");
        System.out.println("(All inherit from the same parent class Shape)");
    }
}