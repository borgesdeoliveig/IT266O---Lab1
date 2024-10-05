3//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Gabriele Borges de Oliveira 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");
        Lab1 lab = new Lab1();
        System.out.println(lab.increment(1));

        int[] values = {5, 9, 3, 12, 7, 3, 11, 5};

        // Output the array in order
        int index = 0;
        System.out.print("Array in order: ");
        while (index < values.length) {
            System.out.print(values[index] + " ");
            index++;
        }
        System.out.println();

        // Output the array in reverse
        System.out.print("Array in reverse: ");
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        // Output first and last values
        System.out.println("First value: " + values[0]);
        System.out.println("Last value: " + values[values.length - 1]);

        // Call the methods
        System.out.println("Max of 5 and 9: " + lab.max(5, 9));
        System.out.println("Min of 5 and 9: " + lab.min(5, 9));
        System.out.println("Sum of array: " + lab.sum(values));
        System.out.println("Average of array: " + lab.average(values));
        System.out.println("Max in array: " + lab.max(values));
        System.out.println("Min in array: " + lab.min(values));
    }
}

// Add all of the methods here
class Lab1 {
    public int increment(int num) {
        return ++num;
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public double average(int[] nums) {
        return (double) sum(nums) / nums.length;
    }

    public int max(int[] nums) {
        int maximum = nums[0];
        for (int num : nums) {
            if (num > maximum) {
                maximum = num;
            }
        }
        return maximum;
    }

    public int min(int[] nums) {
        int minimum = nums[0];
        for (int num : nums) {
            if (num < minimum) {
                minimum = num;
            }
        }
        return minimum;
    }
}
3