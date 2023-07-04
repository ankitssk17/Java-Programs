import java.util.*;

public class arr2 {

    public static int findDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
           // int j = 0;
            for ( int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) { // int arr[] = { 2, 85, 85, 6, 3,1,4 };
                        return arr[i];
                    }
                }
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 7, 2, 5, 99, 3, 99 };
        int n = findDuplicate(arr);
        System.out.println(n);

    }
}
