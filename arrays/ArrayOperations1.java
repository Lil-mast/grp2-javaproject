/*
This is Group 2 Java
*/
public class ArrayOperations1 {

    public static void main(String[] args) {

        int[] numbers = {3, 6, 9, 12, 15, 9};


        // --- Traversal: Accessing and displaying each element ---

        System.out.println("Array Traversal:");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Element at index " + i + ": " + numbers[i]);

        }


        // --- Iteration: Performing a repeated operation (sum of elements) ---

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i]; // performing an action repeatedly

        }

        System.out.println("\nSum of all elements: " + sum);


        // --- Check for duplicates ---

        if (hasDuplicates(numbers)) {

            System.out.println("\nThe array contains duplicate elements.");

        } else {

            System.out.println("\nThe array does not contain any duplicates.");

        }

    }


    // Method to check if the array contains duplicate elements

    public static boolean hasDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    return true; // duplicate found

                }

            }

        }

        return false; // no duplicates found

    }

}

