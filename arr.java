import java.util.*;

public class arr {

    public static int findUnique(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;/*
                       * here j is used outside its for loop scope (see line no.15)
                       * thats why we need to declare it outside the for loop while we can use it in
                       * for lopp ofcourse
                       */
            for (; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) { // int arr[] = { 2, 85, 85, 6, 3,1,4 };
                        break;
                    }
                }
            }
            if (j == arr.length) { // at a certain time if loop didnt find a j for arr[i]==arr[j]means jth loop
                                   // will check for j==arr.length whhere for inner condition of foor loop wont
                                   // fulfill i.e j<arr.length not true hence loop wont execute thus we come out of
                                   // lop and value of j will be = arr lengththat means we checked for every value
                                   // of arrj for corrsponding arri and didnt find equality thus this this arr i is
                                   // thr unique element
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 85, 3, 2, 3, 2, 4 };
        int n = findUnique(arr);
        System.out.println(n);

    }
}
