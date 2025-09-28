# Java Inheritance Examples

This repository demonstrates **Inheritance** - one of the four fundamental principles of Object-Oriented Programming in Java, with comprehensive examples of all types of inheritance supported by Java.

## What is Inheritance?

Inheritance is a mechanism where a new class (child/subclass) inherits properties and methods from an existing class (parent/superclass). It promotes code reusability and establishes a relationship between classes.

## Repository Contents

This repository contains comprehensive examples of all inheritance types supported in Java:

### 📁 Files Overview

1. **`Inheritance.java`** - Basic inheritance example (Class A and Class B)
2. **`SingleInheritance.java`** - Single inheritance with Vehicle and Car classes
3. **`MultilevelInheritance.java`** - Multilevel inheritance chain: LivingBeing → Animal → Dog
4. **`HierarchicalInheritance.java`** - Multiple classes inheriting from Shape class
5. **`InheritanceTypes.java`** - Comprehensive example showing all inheritance types

## Types of Inheritance in Java

### ✅ Supported Types:

#### 1. **Single Inheritance** (`SingleInheritance.java`)
- One child class extends one parent class
- Example: `Car extends Vehicle`

#### 2. **Multilevel Inheritance** (`MultilevelInheritance.java`)  
- Chain of inheritance: Grandparent → Parent → Child
- Example: `Dog extends Animal extends LivingBeing`

#### 3. **Hierarchical Inheritance** (`HierarchicalInheritance.java`)
- Multiple classes inherit from the same parent
- Example: `Circle, Rectangle, Triangle, Square all extend Shape`

### ❌ Not Supported:
- **Multiple Inheritance** with classes (Diamond Problem)
- **Hybrid Inheritance** (due to multiple inheritance limitation)

*Note: Java supports multiple inheritance through interfaces*

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

## How to Run Each Example

### Basic Inheritance:
```bash
javac Inheritance.java && java Inheritance
```

### Single Inheritance:
```bash
javac SingleInheritance.java && java SingleInheritance
```

### Multilevel Inheritance:
```bash
javac MultilevelInheritance.java && java MultilevelInheritance
```

### Hierarchical Inheritance:
```bash
javac HierarchicalInheritance.java && java HierarchicalInheritance
```

### All Types Combined:
```bash
javac InheritanceTypes.java && java InheritanceTypes
```

## Example Outputs

### Basic Inheritance Output:

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