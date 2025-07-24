/**
 * DataTypesDemo.java - Java Core Foundations Practice
 * 
 * Demonstrates:
 * - Primitive data types and their characteristics
 * - Reference data types
 * - Type conversion (implicit and explicit)
 * - Wrapper classes
 * 
 * @author Student Name
 * @version 1.0
 * @since 2024
 */
public class DataTypesDemo {
    
    public static void runDataTypesDemo() {
        System.out.println("📊 Data Types Demonstration");
        System.out.println("---------------------------");
        
        // 1. Primitive Data Types
        demonstratePrimitiveTypes();
        
        // 2. Reference Data Types
        demonstrateReferenceTypes();
        
        // 3. Type Conversion
        demonstrateTypeConversion();
        
        // 4. Wrapper Classes
        demonstrateWrapperClasses();
    }
    
    /**
     * Demonstrates all primitive data types in Java
     */
    private static void demonstratePrimitiveTypes() {
        System.out.println("\n🔢 Primitive Data Types:");
        
        // Integer types
        byte byteValue = 127;                    // 8-bit, range: -128 to 127
        short shortValue = 32767;                // 16-bit, range: -32,768 to 32,767
        int intValue = 2147483647;               // 32-bit, range: -2^31 to 2^31-1
        long longValue = 9223372036854775807L;   // 64-bit, range: -2^63 to 2^63-1
        
        // Floating-point types
        float floatValue = 3.14f;                // 32-bit floating point
        double doubleValue = 3.14159265359;      // 64-bit floating point
        
        // Character type
        char charValue = 'A';                    // 16-bit Unicode character
        
        // Boolean type
        boolean booleanValue = true;              // true or false
        
        // Display values and their characteristics
        System.out.println("Integer Types:");
        System.out.println("  byte: " + byteValue + " (8-bit, range: -128 to 127)");
        System.out.println("  short: " + shortValue + " (16-bit, range: -32,768 to 32,767)");
        System.out.println("  int: " + intValue + " (32-bit, range: -2^31 to 2^31-1)");
        System.out.println("  long: " + longValue + " (64-bit, range: -2^63 to 2^63-1)");
        
        System.out.println("\nFloating-Point Types:");
        System.out.println("  float: " + floatValue + " (32-bit, precision: 6-7 digits)");
        System.out.println("  double: " + doubleValue + " (64-bit, precision: 15-16 digits)");
        
        System.out.println("\nOther Types:");
        System.out.println("  char: '" + charValue + "' (16-bit Unicode)");
        System.out.println("  boolean: " + booleanValue + " (true or false)");
        
        // Demonstrate default values
        System.out.println("\nDefault Values:");
        System.out.println("  Default int: " + new int[1][0]);
        System.out.println("  Default double: " + new double[1][0]);
        System.out.println("  Default boolean: " + new boolean[1][0]);
        System.out.println("  Default char: '" + new char[1][0] + "'");
    }
    
    /**
     * Demonstrates reference data types
     */
    private static void demonstrateReferenceTypes() {
        System.out.println("\n📦 Reference Data Types:");
        
        // String (special reference type)
        String stringValue = "Hello, Java!";
        
        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Apple", "Banana", "Orange"};
        
        // Objects
        Person person = new Person("John", 25);
        
        System.out.println("String: " + stringValue);
        System.out.println("Integer Array: " + java.util.Arrays.toString(intArray));
        System.out.println("String Array: " + java.util.Arrays.toString(stringArray));
        System.out.println("Person Object: " + person);
        
        // Demonstrate null value
        String nullString = null;
        System.out.println("Null String: " + nullString);
    }
    
    /**
     * Demonstrates type conversion (casting)
     */
    private static void demonstrateTypeConversion() {
        System.out.println("\n🔄 Type Conversion:");
        
        // Implicit conversion (widening)
        System.out.println("Implicit Conversion (Widening):");
        int intNum = 100;
        long longNum = intNum;        // int -> long (automatic)
        float floatNum = longNum;     // long -> float (automatic)
        double doubleNum = floatNum;  // float -> double (automatic)
        
        System.out.println("  int -> long: " + intNum + " -> " + longNum);
        System.out.println("  long -> float: " + longNum + " -> " + floatNum);
        System.out.println("  float -> double: " + floatNum + " -> " + doubleNum);
        
        // Explicit conversion (narrowing)
        System.out.println("\nExplicit Conversion (Narrowing):");
        double doubleValue = 123.456;
        int intValue = (int) doubleValue;    // double -> int (explicit cast)
        byte byteValue = (byte) intValue;    // int -> byte (explicit cast)
        
        System.out.println("  double -> int: " + doubleValue + " -> " + intValue);
        System.out.println("  int -> byte: " + intValue + " -> " + byteValue);
        
        // Character conversion
        System.out.println("\nCharacter Conversion:");
        char charValue = 'A';
        int charToInt = charValue;            // char -> int (implicit)
        char intToChar = (char) (charToInt + 1); // int -> char (explicit)
        
        System.out.println("  char -> int: '" + charValue + "' -> " + charToInt);
        System.out.println("  int -> char: " + charToInt + " -> '" + intToChar + "'");
    }
    
    /**
     * Demonstrates wrapper classes
     */
    private static void demonstrateWrapperClasses() {
        System.out.println("\n📦 Wrapper Classes:");
        
        // Creating wrapper objects
        Integer intWrapper = Integer.valueOf(100);
        Double doubleWrapper = Double.valueOf(3.14);
        Boolean booleanWrapper = Boolean.valueOf(true);
        Character charWrapper = Character.valueOf('X');
        
        System.out.println("Wrapper Objects:");
        System.out.println("  Integer: " + intWrapper);
        System.out.println("  Double: " + doubleWrapper);
        System.out.println("  Boolean: " + booleanWrapper);
        System.out.println("  Character: " + charWrapper);
        
        // Converting between primitive and wrapper
        System.out.println("\nPrimitive <-> Wrapper Conversion:");
        int primitiveInt = intWrapper.intValue();      // Wrapper -> Primitive
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Primitive -> Wrapper
        
        System.out.println("  Wrapper -> Primitive: " + intWrapper + " -> " + primitiveInt);
        System.out.println("  Primitive -> Wrapper: " + primitiveInt + " -> " + wrapperInt);
        
        // Auto-boxing and auto-unboxing (Java 5+)
        System.out.println("\nAuto-boxing and Auto-unboxing:");
        Integer autoBoxed = 42;        // Auto-boxing: int -> Integer
        int autoUnboxed = autoBoxed;   // Auto-unboxing: Integer -> int
        
        System.out.println("  Auto-boxing: 42 -> " + autoBoxed);
        System.out.println("  Auto-unboxing: " + autoBoxed + " -> " + autoUnboxed);
        
        // Utility methods
        System.out.println("\nWrapper Class Utility Methods:");
        System.out.println("  Integer.parseInt(\"123\"): " + Integer.parseInt("123"));
        System.out.println("  Double.parseDouble(\"3.14\"): " + Double.parseDouble("3.14"));
        System.out.println("  Integer.toBinaryString(42): " + Integer.toBinaryString(42));
        System.out.println("  Integer.toHexString(255): " + Integer.toHexString(255));
    }
    
    /**
     * Simple Person class for demonstration
     */
    private static class Person {
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }
} 