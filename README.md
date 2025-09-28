# Java Inheritance Example

This repository demonstrates **Inheritance** - one of the four fundamental principles of Object-Oriented Programming in Java.

## What is Inheritance?

Inheritance is a mechanism where a new class (child/subclass) inherits properties and methods from an existing class (parent/superclass). It promotes code reusability and establishes a relationship between classes.

## Code Structure

### Class A (Parent Class)
- Contains `protected` variables `a` and `b`
- Has a `show()` method that calculates and displays the sum

### Class B (Child Class)
- **Extends** Class A (inherits all protected and public members)
- Can access inherited variables `a` and `b`
- Has its own `display()` method
- Can call inherited methods

## Key Concepts Demonstrated

### 1. **Protected Access Modifier**
```java
protected int a = 10;  // Accessible in subclasses
protected int b = 20;  // Accessible in subclasses
```

### 2. **Inheritance Syntax**
```java
class B extends A {  // B inherits from A
    // Can access a, b, and show() method
}
```

### 3. **Inherited Member Access**
```java
int f = a + b + d;  // Using inherited variables a and b
objB.show();        // Calling inherited method
```

## Access Modifiers in Inheritance

| Modifier | Same Class | Same Package | Subclass | Other Package |
|----------|------------|--------------|----------|---------------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

## How to Run

1. Compile the Java file:
   ```bash
   javac Inheritance.java
   ```

2. Run the program:
   ```bash
   java Inheritance
   ```

## Expected Output

```
=== Inheritance Example ===
1. Parent Class A:
The sum is: 30

Calling show() from inherited class B:
The sum is: 30
Calling display() from class B:
This is the display method of class B
The sum is: 39

Values accessible in class B:
a = 10
b = 20
```

## Benefits of Inheritance

1. **Code Reusability**: Child classes can reuse parent class code
2. **Method Overriding**: Child classes can provide specific implementations
3. **Polymorphism**: Objects can be treated as instances of their parent class
4. **Hierarchical Classification**: Natural way to organize related classes

## Learning Points

- ✅ `protected` members are inherited and accessible in subclasses
- ✅ Child classes can access parent class methods and variables
- ✅ `extends` keyword establishes inheritance relationship
- ✅ Child classes can have additional methods and variables
- ✅ Inherited methods can be called on child class objects

---

*This example demonstrates basic inheritance concepts. In real applications, inheritance enables building complex class hierarchies and promotes clean, maintainable code.*