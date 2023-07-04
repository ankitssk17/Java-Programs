public class arr3 {
    public static void findIntersection(int array1[], int array2[]) {
        for (int i = 0; i < array1.length; i++) {
            // int j = 0;here j is not used outside its scope of for loop so we can declare
            // j inside this inner forloop itself
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    array2[j] = Integer.MIN_VALUE; // So that only one common element print not every
                }
            }
        }
    }
    public static void main(String args[]) {
        int arr1[] = { 5, 20, 15, 20, 7, 9, 7, 7 };
        int arr2[] = { 7, 21, 9, 20, 51 };
        findIntersection(arr1, arr2);
    }
}