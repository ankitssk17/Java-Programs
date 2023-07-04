public class dfsf {
    public static int[] updateArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 10;
        }
        return array;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr1[] = updateArr(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
