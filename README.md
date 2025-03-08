# Duck Simulation Project

This repository contains a Java-based simulation of different types of ducks. The project is structured using the Strategy Design Pattern, allowing ducks to have flexible behaviors for quacking, swimming, and flying.

## Project Overview
This project consists of 17 Java files, categorized into abstract classes, interfaces, and concrete implementations. The goal is to demonstrate polymorphism and dynamic behavior changes in object-oriented programming.

## Files and Their Purpose

### 1. `Duck.java`
- **Abstract class** representing a generic duck.
- Defines three behavior interfaces: `QuackBehaviour`, `SwimBehaviour`, and `FlightBehaviour`.
- Provides setter methods for dynamically changing behaviors.
- Implements methods to perform behaviors (`performQuack()`, `performSwim()`, `performFlight()`).
- Requires subclasses to implement the `display()` method.

### 2. `FlightBehaviour.java`
- **Interface** defining the `fly()` method for different flight behaviors.

### 3. `Fly.java`
- Implements `FlightBehaviour`.
- Provides a flying capability (`I believe I can Fly...!!`).

### 4. `Fall.java`
- Implements `FlightBehaviour`.
- Represents a duck that cannot fly but falls (`I'm Falling again...!!`).

### 5. `SwimBehaviour.java`
- **Interface** defining the `swim()` method for different swimming behaviors.

### 6. `SwimWithLegs.java`
- Implements `SwimBehaviour`.
- Provides active swimming (`I believe I can swim...`).

### 7. `Floating.java`
- Implements `SwimBehaviour`.
- Represents passive floating (`I believe I can Float...`).

### 8. `Drowning.java`
- Implements `SwimBehaviour`.
- Represents a duck that drowns (`I am Drowning!! Save ME!!`).

### 9. `QuackBehaviour.java`
- **Interface** defining the `quack()` method for different quacking behaviors.

### 10. `Quack.java`
- Implements `QuackBehaviour`.
- Represents a normal quacking sound (`Quack Quack!!`).

### 11. `Squeak.java`
- Implements `QuackBehaviour`.
- Represents a squeaky sound (`Squeak Squeak!!`).

### 12. `Mute.java`
- Implements `QuackBehaviour`.
- Represents a silent duck (`I am a Mute Duck!!`).

### 13. `MallardDuck.java`
- **Concrete class** extending `Duck`.
- Implements `display()` method (`I am Mallard Duck!!`).
- Uses `Quack`, `SwimWithLegs`, and `Fly` behaviors.

### 14. `RedHeadDuck.java`
- **Concrete class** extending `Duck`.
- Implements `display()` method (`I'm a red head duck!!`).
- Uses `Quack`, `SwimWithLegs`, and `Fly` behaviors.

### 15. `DecoyDuck.java`
- **Concrete class** extending `Duck`.
- Implements `display()` method (`I am Decoy Duck!!`).
- Uses `Mute`, `Drowning`, and `Fall` behaviors.

### 16. `RubberDuck.java`
- **Concrete class** extending `Duck`.
- Implements `display()` method (`I am Rubber Duck!!`).
- Uses `Squeak`, `Floating`, and `Fall` behaviors.

### 17. `Main.java`
- **Main class** demonstrating different duck types and their behaviors.
- Instantiates `MallardDuck`, `RedHeadDuck`, `RubberDuck`, and `DecoyDuck`.
- Calls `display()`, `performQuack()`, `performSwim()`, and `performFlight()` methods for each duck.

## How to Run the Project
1. Clone the repository.
2. Compile all `.java` files.
3. Run `Main.java` to see the duck simulation in action.

