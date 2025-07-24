/**
 * OOPDemo.java - Object-Oriented Programming Practice
 * 
 * Demonstrates:
 * - Class design and encapsulation
 * - Inheritance and polymorphism
 * - Method overriding and overloading
 * - Abstract classes and interfaces
 * - OOP principles and best practices
 * 
 * @author Student Name
 * @version 1.0
 * @since 2024
 */
public class OOPDemo {
    
    public static void runOOPDemo() {
        System.out.println("🏗️ Object-Oriented Programming Demonstration");
        System.out.println("------------------------------------------");
        
        // 1. Class Design and Encapsulation
        demonstrateEncapsulation();
        
        // 2. Inheritance
        demonstrateInheritance();
        
        // 3. Polymorphism
        demonstratePolymorphism();
        
        // 4. Abstract Classes
        demonstrateAbstractClasses();
        
        // 5. Interfaces
        demonstrateInterfaces();
    }
    
    /**
     * Demonstrates encapsulation principles
     */
    private static void demonstrateEncapsulation() {
        System.out.println("\n🔒 Encapsulation:");
        
        // Create a Student object with proper encapsulation
        Student student = new Student("Alice", 20, "Computer Science");
        System.out.println("Student created: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());
        
        // Demonstrate data hiding - can't access private fields directly
        // student.name = "Bob"; // This would cause compilation error
        
        // Use public methods to modify data
        student.setName("Alice Smith");
        student.setAge(21);
        student.setMajor("Software Engineering");
        System.out.println("After modification:");
        System.out.println("  Name: " + student.getName());
        System.out.println("  Age: " + student.getAge());
        System.out.println("  Major: " + student.getMajor());
        
        // Demonstrate validation in setter
        student.setAge(-5); // Invalid age
        System.out.println("After invalid age: " + student.getAge()); // Should still be 21
    }
    
    /**
     * Student class demonstrating encapsulation
     */
    private static class Student {
        private String name;
        private int age;
        private String major;
        
        public Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }
        
        // Getter methods
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getMajor() { return major; }
        
        // Setter methods with validation
        public void setName(String name) { 
            if (name != null && !name.trim().isEmpty()) {
                this.name = name; 
            }
        }
        
        public void setAge(int age) { 
            if (age >= 0 && age <= 120) {
                this.age = age; 
            }
        }
        
        public void setMajor(String major) { 
            if (major != null && !major.trim().isEmpty()) {
                this.major = major; 
            }
        }
        
        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + ", major='" + major + "'}";
        }
    }
    
    /**
     * Demonstrates inheritance concepts
     */
    private static void demonstrateInheritance() {
        System.out.println("\n👨‍👩‍👧‍👦 Inheritance:");
        
        // Create base class objects
        Animal animal = new Animal("Generic Animal", 5);
        System.out.println("Animal: " + animal);
        animal.makeSound();
        
        // Create derived class objects
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Persian");
        
        System.out.println("Dog: " + dog);
        dog.makeSound();
        dog.fetch();
        
        System.out.println("Cat: " + cat);
        cat.makeSound();
        cat.purr();
        
        // Demonstrate polymorphism through inheritance
        Animal[] animals = {animal, dog, cat};
        System.out.println("\nPolymorphic behavior:");
        for (Animal a : animals) {
            a.makeSound(); // Each calls its own implementation
        }
    }
    
    /**
     * Base class for inheritance demonstration
     */
    private static class Animal {
        protected String name;
        protected int age;
        
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public void makeSound() {
            System.out.println("  " + name + " makes a generic sound");
        }
        
        @Override
        public String toString() {
            return "Animal{name='" + name + "', age=" + age + "}";
        }
    }
    
    /**
     * Derived class Dog
     */
    private static class Dog extends Animal {
        private String breed;
        
        public Dog(String name, int age, String breed) {
            super(name, age); // Call parent constructor
            this.breed = breed;
        }
        
        @Override
        public void makeSound() {
            System.out.println("  " + name + " barks: Woof! Woof!");
        }
        
        public void fetch() {
            System.out.println("  " + name + " fetches the ball");
        }
        
        @Override
        public String toString() {
            return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
        }
    }
    
    /**
     * Derived class Cat
     */
    private static class Cat extends Animal {
        private String breed;
        
        public Cat(String name, int age, String breed) {
            super(name, age); // Call parent constructor
            this.breed = breed;
        }
        
        @Override
        public void makeSound() {
            System.out.println("  " + name + " meows: Meow!");
        }
        
        public void purr() {
            System.out.println("  " + name + " purrs softly");
        }
        
        @Override
        public String toString() {
            return "Cat{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
        }
    }
    
    /**
     * Demonstrates polymorphism (method overriding and overloading)
     */
    private static void demonstratePolymorphism() {
        System.out.println("\n🔄 Polymorphism:");
        
        // Method overloading demonstration
        Calculator calc = new Calculator();
        System.out.println("Method Overloading:");
        System.out.println("  add(5, 3): " + calc.add(5, 3));
        System.out.println("  add(5.5, 3.2): " + calc.add(5.5, 3.2));
        System.out.println("  add(5, 3, 2): " + calc.add(5, 3, 2));
        System.out.println("  add(\"Hello\", \" World\"): " + calc.add("Hello", " World"));
        
        // Method overriding demonstration (runtime polymorphism)
        System.out.println("\nMethod Overriding (Runtime Polymorphism):");
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4, 5)
        };
        
        for (Shape shape : shapes) {
            System.out.println("  " + shape.getClass().getSimpleName() + " area: " + shape.calculateArea());
        }
    }
    
    /**
     * Calculator class demonstrating method overloading
     */
    private static class Calculator {
        // Method overloading - same name, different parameters
        public int add(int a, int b) {
            return a + b;
        }
        
        public double add(double a, double b) {
            return a + b;
        }
        
        public int add(int a, int b, int c) {
            return a + b + c;
        }
        
        public String add(String a, String b) {
            return a + b;
        }
    }
    
    /**
     * Abstract base class for polymorphism demonstration
     */
    private static abstract class Shape {
        public abstract double calculateArea();
    }
    
    /**
     * Circle class
     */
    private static class Circle extends Shape {
        private double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }
    
    /**
     * Rectangle class
     */
    private static class Rectangle extends Shape {
        private double width, height;
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        
        @Override
        public double calculateArea() {
            return width * height;
        }
    }
    
    /**
     * Triangle class
     */
    private static class Triangle extends Shape {
        private double a, b, c;
        
        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public double calculateArea() {
            // Heron's formula
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }
    
    /**
     * Demonstrates abstract classes
     */
    private static void demonstrateAbstractClasses() {
        System.out.println("\n📋 Abstract Classes:");
        
        // Cannot instantiate abstract class directly
        // Vehicle vehicle = new Vehicle(); // This would cause compilation error
        
        // Create concrete implementations
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021);
        
        System.out.println("Car: " + car);
        car.startEngine();
        car.drive();
        car.stopEngine();
        
        System.out.println("Motorcycle: " + motorcycle);
        motorcycle.startEngine();
        motorcycle.drive();
        motorcycle.stopEngine();
        
        // Polymorphism with abstract class
        Vehicle[] vehicles = {car, motorcycle};
        System.out.println("\nPolymorphic behavior with abstract class:");
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.drive();
        }
    }
    
    /**
     * Abstract base class for vehicles
     */
    private static abstract class Vehicle {
        protected String brand;
        protected String model;
        protected int year;
        
        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        
        // Abstract method - must be implemented by subclasses
        public abstract void startEngine();
        
        // Concrete method - can be used by all subclasses
        public void drive() {
            System.out.println("  " + brand + " " + model + " is driving");
        }
        
        public void stopEngine() {
            System.out.println("  " + brand + " " + model + " engine stopped");
        }
        
        @Override
        public String toString() {
            return brand + " " + model + " (" + year + ")";
        }
    }
    
    /**
     * Concrete implementation of Vehicle
     */
    private static class Car extends Vehicle {
        public Car(String brand, String model, int year) {
            super(brand, model, year);
        }
        
        @Override
        public void startEngine() {
            System.out.println("  " + brand + " " + model + " car engine started with key");
        }
    }
    
    /**
     * Concrete implementation of Vehicle
     */
    private static class Motorcycle extends Vehicle {
        public Motorcycle(String brand, String model, int year) {
            super(brand, model, year);
        }
        
        @Override
        public void startEngine() {
            System.out.println("  " + brand + " " + model + " motorcycle engine started with kick");
        }
    }
    
    /**
     * Demonstrates interfaces
     */
    private static void demonstrateInterfaces() {
        System.out.println("\n📄 Interfaces:");
        
        // Create objects that implement interfaces
        SmartPhone phone = new SmartPhone("iPhone", "14 Pro");
        Laptop laptop = new Laptop("MacBook", "Pro");
        
        System.out.println("SmartPhone: " + phone);
        phone.powerOn();
        phone.connect();
        phone.process();
        phone.powerOff();
        
        System.out.println("Laptop: " + laptop);
        laptop.powerOn();
        laptop.connect();
        laptop.process();
        laptop.powerOff();
        
        // Demonstrate interface polymorphism
        Powerable[] powerables = {phone, laptop};
        Connectable[] connectables = {phone, laptop};
        Processable[] processables = {phone, laptop};
        
        System.out.println("\nInterface Polymorphism:");
        System.out.println("Powerable devices:");
        for (Powerable device : powerables) {
            device.powerOn();
        }
        
        System.out.println("Connectable devices:");
        for (Connectable device : connectables) {
            device.connect();
        }
        
        System.out.println("Processable devices:");
        for (Processable device : processables) {
            device.process();
        }
    }
    
    /**
     * Interface for power management
     */
    private static interface Powerable {
        void powerOn();
        void powerOff();
    }
    
    /**
     * Interface for network connectivity
     */
    private static interface Connectable {
        void connect();
    }
    
    /**
     * Interface for data processing
     */
    private static interface Processable {
        void process();
    }
    
    /**
     * SmartPhone class implementing multiple interfaces
     */
    private static class SmartPhone implements Powerable, Connectable, Processable {
        private String brand;
        private String model;
        private boolean isOn = false;
        
        public SmartPhone(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }
        
        @Override
        public void powerOn() {
            isOn = true;
            System.out.println("  " + brand + " " + model + " smartphone powered on");
        }
        
        @Override
        public void powerOff() {
            isOn = false;
            System.out.println("  " + brand + " " + model + " smartphone powered off");
        }
        
        @Override
        public void connect() {
            if (isOn) {
                System.out.println("  " + brand + " " + model + " connected to WiFi/5G");
            }
        }
        
        @Override
        public void process() {
            if (isOn) {
                System.out.println("  " + brand + " " + model + " processing apps and data");
            }
        }
        
        @Override
        public String toString() {
            return brand + " " + model + " (SmartPhone)";
        }
    }
    
    /**
     * Laptop class implementing multiple interfaces
     */
    private static class Laptop implements Powerable, Connectable, Processable {
        private String brand;
        private String model;
        private boolean isOn = false;
        
        public Laptop(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }
        
        @Override
        public void powerOn() {
            isOn = true;
            System.out.println("  " + brand + " " + model + " laptop powered on");
        }
        
        @Override
        public void powerOff() {
            isOn = false;
            System.out.println("  " + brand + " " + model + " laptop powered off");
        }
        
        @Override
        public void connect() {
            if (isOn) {
                System.out.println("  " + brand + " " + model + " connected to WiFi/Ethernet");
            }
        }
        
        @Override
        public void process() {
            if (isOn) {
                System.out.println("  " + brand + " " + model + " processing applications and tasks");
            }
        }
        
        @Override
        public String toString() {
            return brand + " " + model + " (Laptop)";
        }
    }
} 