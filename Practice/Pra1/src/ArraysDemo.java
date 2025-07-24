/**
 * ArraysDemo.java - Arrays and Algorithms Practice
 * 
 * Demonstrates:
 * - 1D and 2D array creation and manipulation
 * - Sorting algorithms (Bubble, Selection, Insertion)
 * - Searching algorithms (Linear, Binary)
 * - Array utility methods
 * - Array algorithms and problem-solving
 * 
 * @author Student Name
 * @version 1.0
 * @since 2024
 */
public class ArraysDemo {
    
    public static void runArraysDemo() {
        System.out.println("📊 Arrays and Algorithms Demonstration");
        System.out.println("------------------------------------");
        
        // 1. Basic Array Operations
        demonstrateBasicArrays();
        
        // 2. 2D Arrays
        demonstrate2DArrays();
        
        // 3. Sorting Algorithms
        demonstrateSortingAlgorithms();
        
        // 4. Searching Algorithms
        demonstrateSearchingAlgorithms();
        
        // 5. Array Utility Methods
        demonstrateArrayUtilities();
    }
    
    /**
     * Demonstrates basic 1D array operations
     */
    private static void demonstrateBasicArrays() {
        System.out.println("\n🔢 Basic Array Operations:");
        
        // Array declaration and initialization
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));
        
        // Array length
        System.out.println("Array length: " + numbers.length);
        
        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        System.out.println("Middle element: " + numbers[numbers.length / 2]);
        
        // Modifying elements
        numbers[0] = 100;
        System.out.println("After modifying first element: " + java.util.Arrays.toString(numbers));
        
        // Array iteration
        System.out.println("\nArray iteration:");
        System.out.print("  For loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        System.out.print("  Enhanced for loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Array copying
        int[] copy = java.util.Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + java.util.Arrays.toString(copy));
        
        // Array comparison
        System.out.println("Arrays are equal: " + java.util.Arrays.equals(numbers, copy));
    }
    
    /**
     * Demonstrates 2D arrays
     */
    private static void demonstrate2DArrays() {
        System.out.println("\n📋 2D Arrays:");
        
        // 2D array declaration and initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Accessing elements
        System.out.println("Element at [1][1]: " + matrix[1][1]);
        System.out.println("Element at [0][2]: " + matrix[0][2]);
        
        // Modifying elements
        matrix[1][1] = 50;
        System.out.println("After modifying [1][1]:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Jagged arrays
        int[][] jagged = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };
        
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Demonstrates sorting algorithms
     */
    private static void demonstrateSortingAlgorithms() {
        System.out.println("\n🔄 Sorting Algorithms:");
        
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        
        // Bubble Sort
        int[] bubbleArr = java.util.Arrays.copyOf(arr, arr.length);
        bubbleSort(bubbleArr);
        System.out.println("Bubble sort: " + java.util.Arrays.toString(bubbleArr));
        
        // Selection Sort
        int[] selectionArr = java.util.Arrays.copyOf(arr, arr.length);
        selectionSort(selectionArr);
        System.out.println("Selection sort: " + java.util.Arrays.toString(selectionArr));
        
        // Insertion Sort
        int[] insertionArr = java.util.Arrays.copyOf(arr, arr.length);
        insertionSort(insertionArr);
        System.out.println("Insertion sort: " + java.util.Arrays.toString(insertionArr));
        
        // Built-in sort
        int[] builtinArr = java.util.Arrays.copyOf(arr, arr.length);
        java.util.Arrays.sort(builtinArr);
        System.out.println("Built-in sort: " + java.util.Arrays.toString(builtinArr));
    }
    
    /**
     * Bubble Sort implementation
     */
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * Selection Sort implementation
     */
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    /**
     * Insertion Sort implementation
     */
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    /**
     * Demonstrates searching algorithms
     */
    private static void demonstrateSearchingAlgorithms() {
        System.out.println("\n🔍 Searching Algorithms:");
        
        int[] arr = {11, 12, 22, 25, 34, 64, 90}; // Sorted array
        int target = 25;
        
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Searching for: " + target);
        
        // Linear Search
        int linearResult = linearSearch(arr, target);
        System.out.println("Linear search result: " + linearResult);
        
        // Binary Search
        int binaryResult = binarySearch(arr, target);
        System.out.println("Binary search result: " + binaryResult);
        
        // Built-in binary search
        int builtinResult = java.util.Arrays.binarySearch(arr, target);
        System.out.println("Built-in binary search result: " + builtinResult);
        
        // Search for non-existent element
        int notFound = 99;
        System.out.println("\nSearching for: " + notFound);
        System.out.println("Linear search result: " + linearSearch(arr, notFound));
        System.out.println("Binary search result: " + binarySearch(arr, notFound));
    }
    
    /**
     * Linear Search implementation
     */
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }
    
    /**
     * Binary Search implementation
     */
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }
    
    /**
     * Demonstrates array utility methods
     */
    private static void demonstrateArrayUtilities() {
        System.out.println("\n🛠️ Array Utility Methods:");
        
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        
        // Finding maximum and minimum
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
        // Finding sum and average
        int sum = findSum(arr);
        double average = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        // Reversing array
        int[] reversed = reverseArray(arr);
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversed));
        
        // Finding frequency
        int target = 1;
        int frequency = findFrequency(arr, target);
        System.out.println("Frequency of " + target + ": " + frequency);
        
        // Array rotation
        int[] rotated = rotateArray(arr, 2);
        System.out.println("Array rotated by 2: " + java.util.Arrays.toString(rotated));
        
        // Finding duplicates
        int[] duplicates = findDuplicates(arr);
        System.out.println("Duplicates: " + java.util.Arrays.toString(duplicates));
    }
    
    /**
     * Finds maximum value in array
     */
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Finds minimum value in array
     */
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    /**
     * Finds sum of array elements
     */
    private static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Reverses an array
     */
    private static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    
    /**
     * Finds frequency of an element
     */
    private static int findFrequency(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Rotates array by given positions
     */
    private static int[] rotateArray(int[] arr, int positions) {
        int n = arr.length;
        int[] rotated = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotated[(i + positions) % n] = arr[i];
        }
        return rotated;
    }
    
    /**
     * Finds duplicate elements
     */
    private static int[] findDuplicates(int[] arr) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        java.util.Set<Integer> duplicates = new java.util.HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }
} 