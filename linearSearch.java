import java.util.*;

public class linearSearch {
    public static int lsearch(int array[], int k) {
        // System.out.println("Enter the key: ");
        // Scanner sc = new Scanner(System.in);
        // int k=sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 7, 6, 25, 33 };
        int key = lsearch(arr, 17);
        if (key == -1) {
            System.out.println("Not Found!");
        } else {
            System.out.println(key);
        }

    }

}
