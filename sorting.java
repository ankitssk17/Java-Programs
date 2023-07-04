public class sorting {

  /*   public static void bubbleSort(int array[]){
        for(int i = 0; i<array.length-1;i++){
            for(int j)
        }
    }*/

    public static void printf(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            // for every iteration of i if we find a minimim correspodnig to i then swap mim
            // value to ith position
            // and value at ith position to minIndex value
            array[minIndex] = array[i];
            array[i] = min;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 9, 25, 6, 1, 7, 10 };
        selectSort(arr);
        printf(arr);

    }
}
