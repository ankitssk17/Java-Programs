import java.util.*;

public class arrFunction {
    // Method to create an array of size n
    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    // Method to print a given array
    public static void printArray(int input[]) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();

    }

    // Method to update array elements
    public static int[] updateArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 10;
        }
        return array;
    }

    // Method to find Minimum element in an array
    public static int minofArray(int marray[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < marray.length; i++) {
            if (marray[i] < min) {
                min = marray[i];
            }
        }
        return min;
    }

    // Method to find the maximum element of an array
    public static int maxofArray(int marray[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < marray.length; i++) {
            if (marray[i] > max) {
                max = marray[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = getArray();
        /*
         * System.out.println("Initial array value: ");
         * printArray(arr);
         * System.out.println("Updated array value: ");
         * updateArr(arr);
         */
        printArray(arr);
        int Minimum = minofArray(arr);
        System.out.println("Minimum element of the array is: " + Minimum);
        int Maximum = maxofArray(arr);
        System.out.println("Maximum element of the array is: " + Maximum);

    }
}
