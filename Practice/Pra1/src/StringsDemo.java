/**
 * StringsDemo.java - String Handling Practice
 * 
 * Demonstrates:
 * - String creation and manipulation
 * - StringBuilder vs StringBuffer
 * - String methods and operations
 * - String comparison and searching
 * - String algorithms and problem-solving
 * 
 * @author Student Name
 * @version 1.0
 * @since 2024
 */
public class StringsDemo {
    
    public static void runStringsDemo() {
        System.out.println("📝 String Handling Demonstration");
        System.out.println("-------------------------------");
        
        // 1. Basic String Operations
        demonstrateBasicStringOperations();
        
        // 2. String Methods
        demonstrateStringMethods();
        
        // 3. StringBuilder vs StringBuffer
        demonstrateStringBuilderVsBuffer();
        
        // 4. String Comparison
        demonstrateStringComparison();
        
        // 5. String Algorithms
        demonstrateStringAlgorithms();
    }
    
    /**
     * Demonstrates basic string operations
     */
    private static void demonstrateBasicStringOperations() {
        System.out.println("\n🔤 Basic String Operations:");
        
        // String creation
        String str1 = "Hello";
        String str2 = new String("World");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        
        System.out.println("String creation:");
        System.out.println("  str1: " + str1);
        System.out.println("  str2: " + str2);
        System.out.println("  str3: " + str3);
        
        // String concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("\nString concatenation:");
        System.out.println("  str1 + \" \" + str2: " + concatenated);
        System.out.println("  str1.concat(\" World\"): " + str1.concat(" World"));
        
        // String manipulation
        String original = "  Hello World  ";
        System.out.println("\nString manipulation:");
        System.out.println("  Original: '" + original + "'");
        System.out.println("  trim(): '" + original.trim() + "'");
        System.out.println("  toUpperCase(): '" + original.toUpperCase() + "'");
        System.out.println("  toLowerCase(): '" + original.toLowerCase() + "'");
        System.out.println("  replace('o', '0'): '" + original.replace('o', '0') + "'");
        
        // String immutability demonstration
        String immutable = "Original";
        System.out.println("\nString immutability:");
        System.out.println("  Original: " + immutable);
        immutable.toUpperCase(); // This doesn't change the original string
        System.out.println("  After toUpperCase(): " + immutable);
        String changed = immutable.toUpperCase(); // Need to assign to new variable
        System.out.println("  Assigned to new variable: " + changed);
    }
    
    /**
     * Demonstrates various string methods
     */
    private static void demonstrateStringMethods() {
        System.out.println("\n🛠️ String Methods:");
        
        String text = "Hello World Java Programming";
        System.out.println("Original text: " + text);
        
        // Basic string methods
        System.out.println("\nBasic methods:");
        System.out.println("  length(): " + text.length());
        System.out.println("  charAt(0): '" + text.charAt(0) + "'");
        System.out.println("  charAt(6): '" + text.charAt(6) + "'");
        System.out.println("  isEmpty(): " + text.isEmpty());
        System.out.println("  \"\".isEmpty(): " + "".isEmpty());
        
        // Substring methods
        System.out.println("\nSubstring methods:");
        System.out.println("  substring(0, 5): '" + text.substring(0, 5) + "'");
        System.out.println("  substring(6): '" + text.substring(6) + "'");
        System.out.println("  substring(6, 11): '" + text.substring(6, 11) + "'");
        
        // Search methods
        System.out.println("\nSearch methods:");
        System.out.println("  indexOf('o'): " + text.indexOf('o'));
        System.out.println("  lastIndexOf('o'): " + text.lastIndexOf('o'));
        System.out.println("  indexOf(\"World\"): " + text.indexOf("World"));
        System.out.println("  contains(\"Java\"): " + text.contains("Java"));
        System.out.println("  startsWith(\"Hello\"): " + text.startsWith("Hello"));
        System.out.println("  endsWith(\"Programming\"): " + text.endsWith("Programming"));
        
        // Split and join
        System.out.println("\nSplit and join:");
        String[] words = text.split(" ");
        System.out.println("  split(\" \"): " + java.util.Arrays.toString(words));
        System.out.println("  join(\"-\", words): " + String.join("-", words));
        
        // Character iteration
        System.out.println("\nCharacter iteration:");
        System.out.print("  Characters: ");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
        
        // String comparison methods
        System.out.println("\nComparison methods:");
        String str1 = "hello";
        String str2 = "HELLO";
        System.out.println("  str1: " + str1 + ", str2: " + str2);
        System.out.println("  equals(str2): " + str1.equals(str2));
        System.out.println("  equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println("  compareTo(str2): " + str1.compareTo(str2));
    }
    
    /**
     * Demonstrates StringBuilder vs StringBuffer differences
     */
    private static void demonstrateStringBuilderVsBuffer() {
        System.out.println("\n⚡ StringBuilder vs StringBuffer:");
        
        // Performance comparison
        System.out.println("Performance comparison (100,000 concatenations):");
        
        // String concatenation (immutable)
        long startTime = System.currentTimeMillis();
        String strResult = "";
        for (int i = 0; i < 100000; i++) {
            strResult += "a";
        }
        long strTime = System.currentTimeMillis() - startTime;
        System.out.println("  String concatenation: " + strTime + "ms (result length: " + strResult.length() + ")");
        
        // StringBuilder (mutable, not thread-safe)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        long sbTime = System.currentTimeMillis() - startTime;
        System.out.println("  StringBuilder: " + sbTime + "ms");
        
        // StringBuffer (mutable, thread-safe)
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sbf.append("a");
        }
        long sbfTime = System.currentTimeMillis() - startTime;
        System.out.println("  StringBuffer: " + sbfTime + "ms");
        
        // StringBuilder methods
        System.out.println("\nStringBuilder methods:");
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println("  Original: " + builder);
        builder.append(" World");
        System.out.println("  append(\" World\"): " + builder);
        builder.insert(5, " Java ");
        System.out.println("  insert(5, \" Java \"): " + builder);
        builder.delete(5, 10);
        System.out.println("  delete(5, 10): " + builder);
        builder.reverse();
        System.out.println("  reverse(): " + builder);
        builder.reverse(); // Reverse back
        builder.setCharAt(0, 'h');
        System.out.println("  setCharAt(0, 'h'): " + builder);
        
        // StringBuffer methods (similar to StringBuilder)
        System.out.println("\nStringBuffer methods:");
        StringBuffer buffer = new StringBuffer("Java");
        System.out.println("  Original: " + buffer);
        buffer.append(" Programming");
        System.out.println("  append(\" Programming\"): " + buffer);
        buffer.insert(4, " is ");
        System.out.println("  insert(4, \" is \"): " + buffer);
        
        // Thread safety demonstration concept
        System.out.println("\nThread safety:");
        System.out.println("  StringBuilder: Not thread-safe (faster)");
        System.out.println("  StringBuffer: Thread-safe (slower)");
        System.out.println("  Use StringBuilder for single-threaded applications");
        System.out.println("  Use StringBuffer for multi-threaded applications");
    }
    
    /**
     * Demonstrates string comparison techniques
     */
    private static void demonstrateStringComparison() {
        System.out.println("\n🔍 String Comparison:");
        
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        String str4 = new String("Hello");
        
        System.out.println("Strings to compare:");
        System.out.println("  str1: \"" + str1 + "\"");
        System.out.println("  str2: \"" + str2 + "\"");
        System.out.println("  str3: \"" + str3 + "\"");
        System.out.println("  str4: \"" + str4 + "\" (new String)");
        
        // Reference comparison (==)
        System.out.println("\nReference comparison (==):");
        System.out.println("  str1 == str3: " + (str1 == str3));
        System.out.println("  str1 == str4: " + (str1 == str4));
        System.out.println("  str1 == str2: " + (str1 == str2));
        
        // Content comparison (equals)
        System.out.println("\nContent comparison (equals):");
        System.out.println("  str1.equals(str3): " + str1.equals(str3));
        System.out.println("  str1.equals(str4): " + str1.equals(str4));
        System.out.println("  str1.equals(str2): " + str1.equals(str2));
        
        // Case-insensitive comparison
        System.out.println("\nCase-insensitive comparison:");
        System.out.println("  str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println("  str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2));
        
        // Lexicographic comparison
        System.out.println("\nLexicographic comparison (compareTo):");
        System.out.println("  str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("  str2.compareTo(str1): " + str2.compareTo(str1));
        System.out.println("  str1.compareTo(str3): " + str1.compareTo(str3));
        
        // String pool demonstration
        System.out.println("\nString pool demonstration:");
        String pool1 = "Java";
        String pool2 = "Java";
        String new1 = new String("Java");
        String new2 = new String("Java");
        
        System.out.println("  pool1 == pool2: " + (pool1 == pool2)); // true (same reference)
        System.out.println("  new1 == new2: " + (new1 == new2)); // false (different objects)
        System.out.println("  pool1 == new1: " + (pool1 == new1)); // false
        System.out.println("  pool1.equals(new1): " + pool1.equals(new1)); // true (same content)
        
        // String comparison with null
        System.out.println("\nNull comparison:");
        String nullStr = null;
        System.out.println("  nullStr == null: " + (nullStr == null));
        // System.out.println("  nullStr.equals(\"test\"): " + nullStr.equals("test")); // NullPointerException
        System.out.println("  \"test\".equals(nullStr): " + "test".equals(nullStr)); // Safe way
    }
    
    /**
     * Demonstrates string algorithms
     */
    private static void demonstrateStringAlgorithms() {
        System.out.println("\n🧮 String Algorithms:");
        
        // Palindrome check
        String[] palindromes = {"racecar", "level", "deed", "hello", "A man a plan a canal Panama"};
        System.out.println("Palindrome check:");
        for (String word : palindromes) {
            System.out.println("  \"" + word + "\": " + isPalindrome(word));
        }
        
        // Anagram check
        String[][] anagramPairs = {
            {"listen", "silent"},
            {"heart", "earth"},
            {"hello", "world"},
            {"debit card", "bad credit"}
        };
        System.out.println("\nAnagram check:");
        for (String[] pair : anagramPairs) {
            System.out.println("  \"" + pair[0] + "\" and \"" + pair[1] + "\": " + areAnagrams(pair[0], pair[1]));
        }
        
        // String reversal
        String[] toReverse = {"Hello", "Java", "Programming", "12345"};
        System.out.println("\nString reversal:");
        for (String str : toReverse) {
            System.out.println("  \"" + str + "\" -> \"" + reverseString(str) + "\"");
        }
        
        // Character frequency
        String text = "hello world";
        System.out.println("\nCharacter frequency in \"" + text + "\":");
        java.util.Map<Character, Integer> frequency = getCharacterFrequency(text);
        for (java.util.Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("  '" + entry.getKey() + "': " + entry.getValue());
        }
        
        // Longest common substring
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
        System.out.println("\nLongest common substring:");
        System.out.println("  \"" + str1 + "\" and \"" + str2 + "\": \"" + findLongestCommonSubstring(str1, str2) + "\"");
        
        // String compression
        String[] toCompress = {"aaabbbcc", "abcd", "aabbbcccc"};
        System.out.println("\nString compression:");
        for (String str : toCompress) {
            System.out.println("  \"" + str + "\" -> \"" + compressString(str) + "\"");
        }
    }
    
    /**
     * Checks if a string is a palindrome
     */
    private static boolean isPalindrome(String str) {
        if (str == null) return false;
        
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    /**
     * Checks if two strings are anagrams
     */
    private static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        if (str1.length() != str2.length()) return false;
        
        // Count character frequencies
        int[] charCount = new int[256];
        
        for (char c : str1.toCharArray()) {
            charCount[c]++;
        }
        
        for (char c : str2.toCharArray()) {
            charCount[c]--;
            if (charCount[c] < 0) return false;
        }
        
        return true;
    }
    
    /**
     * Reverses a string
     */
    private static String reverseString(String str) {
        if (str == null) return null;
        
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    /**
     * Gets character frequency in a string
     */
    private static java.util.Map<Character, Integer> getCharacterFrequency(String str) {
        java.util.Map<Character, Integer> frequency = new java.util.HashMap<>();
        
        for (char c : str.toCharArray()) {
            if (c != ' ') { // Skip spaces
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }
        }
        
        return frequency;
    }
    
    /**
     * Finds the longest common substring between two strings
     */
    private static String findLongestCommonSubstring(String str1, String str2) {
        if (str1 == null || str2 == null) return "";
        
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLength = 0;
        int endIndex = 0;
        
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                }
            }
        }
        
        if (maxLength == 0) return "";
        return str1.substring(endIndex - maxLength + 1, endIndex + 1);
    }
    
    /**
     * Compresses a string by counting consecutive characters
     */
    private static String compressString(String str) {
        if (str == null || str.isEmpty()) return str;
        
        StringBuilder compressed = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                if (count > 1) {
                    compressed.append(count);
                }
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        
        compressed.append(currentChar);
        if (count > 1) {
            compressed.append(count);
        }
        
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
} 