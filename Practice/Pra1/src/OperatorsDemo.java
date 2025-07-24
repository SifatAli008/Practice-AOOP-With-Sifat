/**
 * OperatorsDemo.java - Java Operators Practice
 * 
 * Demonstrates:
 * - Arithmetic operators
 * - Relational operators
 * - Logical operators
 * - Bitwise operators
 * - Assignment operators
 * - Operator precedence
 * 
 * @author Student Name
 * @version 1.0
 * @since 2024
 */
public class OperatorsDemo {
    
    public static void runOperatorsDemo() {
        System.out.println("🔧 Operators Demonstration");
        System.out.println("-------------------------");
        
        // 1. Arithmetic Operators
        demonstrateArithmeticOperators();
        
        // 2. Relational Operators
        demonstrateRelationalOperators();
        
        // 3. Logical Operators
        demonstrateLogicalOperators();
        
        // 4. Bitwise Operators
        demonstrateBitwiseOperators();
        
        // 5. Assignment Operators
        demonstrateAssignmentOperators();
        
        // 6. Operator Precedence
        demonstrateOperatorPrecedence();
    }
    
    /**
     * Demonstrates arithmetic operators
     */
    private static void demonstrateArithmeticOperators() {
        System.out.println("\n➕ Arithmetic Operators:");
        
        int a = 10, b = 3;
        
        System.out.println("Variables: a = " + a + ", b = " + b);
        System.out.println("  Addition (+): " + a + " + " + b + " = " + (a + b));
        System.out.println("  Subtraction (-): " + a + " - " + b + " = " + (a - b));
        System.out.println("  Multiplication (*): " + a + " * " + b + " = " + (a * b));
        System.out.println("  Division (/): " + a + " / " + b + " = " + (a / b));
        System.out.println("  Modulus (%): " + a + " % " + b + " = " + (a % b));
        
        // Increment and Decrement
        System.out.println("\nIncrement/Decrement Operators:");
        int x = 5;
        System.out.println("  Original x: " + x);
        System.out.println("  Pre-increment (++x): " + (++x) + " (x is now " + x + ")");
        System.out.println("  Post-increment (x++): " + (x++) + " (x is now " + x + ")");
        System.out.println("  Pre-decrement (--x): " + (--x) + " (x is now " + x + ")");
        System.out.println("  Post-decrement (x--): " + (x--) + " (x is now " + x + ")");
        
        // Floating-point arithmetic
        System.out.println("\nFloating-Point Arithmetic:");
        double d1 = 10.5, d2 = 3.2;
        System.out.println("  " + d1 + " + " + d2 + " = " + (d1 + d2));
        System.out.println("  " + d1 + " - " + d2 + " = " + (d1 - d2));
        System.out.println("  " + d1 + " * " + d2 + " = " + (d1 * d2));
        System.out.println("  " + d1 + " / " + d2 + " = " + (d1 / d2));
    }
    
    /**
     * Demonstrates relational operators
     */
    private static void demonstrateRelationalOperators() {
        System.out.println("\n🔍 Relational Operators:");
        
        int a = 10, b = 20, c = 10;
        
        System.out.println("Variables: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("  Equal to (==): " + a + " == " + c + " is " + (a == c));
        System.out.println("  Not equal to (!=): " + a + " != " + b + " is " + (a != b));
        System.out.println("  Greater than (>): " + b + " > " + a + " is " + (b > a));
        System.out.println("  Less than (<): " + a + " < " + b + " is " + (a < b));
        System.out.println("  Greater than or equal (>=): " + a + " >= " + c + " is " + (a >= c));
        System.out.println("  Less than or equal (<=): " + a + " <= " + b + " is " + (a <= b));
        
        // String comparison
        System.out.println("\nString Comparison:");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        
        System.out.println("  str1 = \"" + str1 + "\", str2 = \"" + str2 + "\", str3 = \"" + str3 + "\"");
        System.out.println("  str1 == str2: " + (str1 == str2));  // Reference comparison
        System.out.println("  str1.equals(str2): " + str1.equals(str2));  // Content comparison
        System.out.println("  str1.equals(str3): " + str1.equals(str3));
    }
    
    /**
     * Demonstrates logical operators
     */
    private static void demonstrateLogicalOperators() {
        System.out.println("\n🔗 Logical Operators:");
        
        boolean p = true, q = false;
        
        System.out.println("Variables: p = " + p + ", q = " + q);
        System.out.println("  Logical AND (&&): " + p + " && " + q + " = " + (p && q));
        System.out.println("  Logical OR (||): " + p + " || " + q + " = " + (p || q));
        System.out.println("  Logical NOT (!): !" + p + " = " + (!p));
        System.out.println("  Logical NOT (!): !" + q + " = " + (!q));
        
        // Short-circuit evaluation
        System.out.println("\nShort-Circuit Evaluation:");
        int x = 5, y = 0;
        System.out.println("Variables: x = " + x + ", y = " + y);
        
        // This won't cause division by zero due to short-circuit
        boolean result1 = (x > 0) && (y / x > 0);
        System.out.println("  (x > 0) && (y / x > 0): " + result1);
        
        // This will cause division by zero
        boolean result2 = (x > 0) & (y / x > 0);
        System.out.println("  (x > 0) & (y / x > 0): " + result2);
    }
    
    /**
     * Demonstrates bitwise operators
     */
    private static void demonstrateBitwiseOperators() {
        System.out.println("\n🔢 Bitwise Operators:");
        
        int a = 60;  // 60 = 00111100 in binary
        int b = 13;  // 13 = 00001101 in binary
        
        System.out.println("Variables: a = " + a + " (" + Integer.toBinaryString(a) + "), b = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("  Bitwise AND (&): " + a + " & " + b + " = " + (a & b) + " (" + Integer.toBinaryString(a & b) + ")");
        System.out.println("  Bitwise OR (|): " + a + " | " + b + " = " + (a | b) + " (" + Integer.toBinaryString(a | b) + ")");
        System.out.println("  Bitwise XOR (^): " + a + " ^ " + b + " = " + (a ^ b) + " (" + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("  Bitwise NOT (~): ~" + a + " = " + (~a) + " (" + Integer.toBinaryString(~a) + ")");
        
        // Shift operators
        System.out.println("\nShift Operators:");
        int x = 8;  // 8 = 00001000 in binary
        System.out.println("Variable: x = " + x + " (" + Integer.toBinaryString(x) + ")");
        System.out.println("  Left shift (<<): " + x + " << 2 = " + (x << 2) + " (" + Integer.toBinaryString(x << 2) + ")");
        System.out.println("  Right shift (>>): " + x + " >> 1 = " + (x >> 1) + " (" + Integer.toBinaryString(x >> 1) + ")");
        System.out.println("  Unsigned right shift (>>>): " + x + " >>> 1 = " + (x >>> 1) + " (" + Integer.toBinaryString(x >>> 1) + ")");
    }
    
    /**
     * Demonstrates assignment operators
     */
    private static void demonstrateAssignmentOperators() {
        System.out.println("\n📝 Assignment Operators:");
        
        int x = 10;
        System.out.println("Initial x: " + x);
        
        // Simple assignment
        x = 20;
        System.out.println("  Simple assignment (=): x = 20 → " + x);
        
        // Compound assignment operators
        x += 5;  // x = x + 5
        System.out.println("  Add and assign (+=): x += 5 → " + x);
        
        x -= 3;  // x = x - 3
        System.out.println("  Subtract and assign (-=): x -= 3 → " + x);
        
        x *= 2;  // x = x * 2
        System.out.println("  Multiply and assign (*=): x *= 2 → " + x);
        
        x /= 4;  // x = x / 4
        System.out.println("  Divide and assign (/=): x /= 4 → " + x);
        
        x %= 3;  // x = x % 3
        System.out.println("  Modulus and assign (%=): x %= 3 → " + x);
        
        x <<= 2;  // x = x << 2
        System.out.println("  Left shift and assign (<<=): x <<= 2 → " + x);
        
        x >>= 1;  // x = x >> 1
        System.out.println("  Right shift and assign (>>=): x >>= 1 → " + x);
        
        x &= 15;  // x = x & 15
        System.out.println("  Bitwise AND and assign (&=): x &= 15 → " + x);
        
        x |= 8;   // x = x | 8
        System.out.println("  Bitwise OR and assign (|=): x |= 8 → " + x);
        
        x ^= 4;   // x = x ^ 4
        System.out.println("  Bitwise XOR and assign (^=): x ^= 4 → " + x);
    }
    
    /**
     * Demonstrates operator precedence
     */
    private static void demonstrateOperatorPrecedence() {
        System.out.println("\n📊 Operator Precedence:");
        
        int a = 2, b = 3, c = 4;
        System.out.println("Variables: a = " + a + ", b = " + b + ", c = " + c);
        
        // Different expressions with same operators but different precedence
        int result1 = a + b * c;        // Multiplication first: 2 + (3 * 4) = 2 + 12 = 14
        int result2 = (a + b) * c;      // Parentheses first: (2 + 3) * 4 = 5 * 4 = 20
        int result3 = a * b + c;        // Multiplication first: (2 * 3) + 4 = 6 + 4 = 10
        int result4 = a + b + c;        // Left to right: (2 + 3) + 4 = 5 + 4 = 9
        
        System.out.println("  a + b * c = " + a + " + " + b + " * " + c + " = " + result1);
        System.out.println("  (a + b) * c = (" + a + " + " + b + ") * " + c + " = " + result2);
        System.out.println("  a * b + c = " + a + " * " + b + " + " + c + " = " + result3);
        System.out.println("  a + b + c = " + a + " + " + b + " + " + c + " = " + result4);
        
        // Logical operator precedence
        System.out.println("\nLogical Operator Precedence:");
        boolean p = true, q = false, r = true;
        System.out.println("Variables: p = " + p + ", q = " + q + ", r = " + r);
        
        boolean logical1 = p && q || r;     // && has higher precedence: (p && q) || r
        boolean logical2 = p && (q || r);   // Parentheses override precedence
        boolean logical3 = !p && q || r;    // ! has highest precedence: (!p && q) || r
        
        System.out.println("  p && q || r = " + logical1);
        System.out.println("  p && (q || r) = " + logical2);
        System.out.println("  !p && q || r = " + logical3);
    }
} 