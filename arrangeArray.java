import java.util.*;
public class arrangeArray {
    public static int[] arrangedArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int N = sc.nextInt();
        int array[] = new int[N];
        int i = 0, j = N - 1, Num = 1;
        while (i < j) {
            array[i] = Num;
            i++;
            Num++;
            array[j] = Num;
            j--;
            Num++;

            if (i == j) {
                array[i] = Num;
            }
        }
        return array;
    }

    public static void main(String args[]) {
        int arr[] = arrangedArray();
      System.out.print("Arranged array is: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print( arr[k]+ " ");
        }
    }
}