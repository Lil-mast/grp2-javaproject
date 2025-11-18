/*
 * 
Differentiate  between iteration and traversal as used in arrays. Using for loop, illustrate in a program how each can be implemented in java.

Iteration- repeating a process or a block of code multiple times often used in groups.
E.G Used to perform actions repeatedly, sum, search, modify.
while
Transversal -  visiting each element of an array one by one usually from start to end. It is used to access or inspect every element.
 */

package arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 3, 7};
        Scanner sc = new Scanner(System.in); // Solve the following error in this line

        // 1. SUM using iteration
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);
    }
}

        // 2. SEARCH using iteration
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Number found!" : "Number not found.");
        // 3. MODIFY using iteration
        System.out.print("Enter number to modify: ");
        int oldVal = sc.nextInt();
        System.out.print("Enter new value: ");
        int newVal = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == oldVal) {
                numbers[i] = newVal;
                System.out.println("Value updated.");
                break;
}
        }
        // Display modified array
        System.out.print("Updated array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
