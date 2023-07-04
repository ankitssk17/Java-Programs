public class binarySearch {
    // Method to find and return index of the searched element
    public static int biSearch(int array[], int k) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) { /*
                                * If the number is on the right side of mid then end will remain same
                                * but start will increase it crosses end and is now greater then end and while
                                * loop will stop in this we checked the
                                * entire right side and if have found out the element the function will return
                                * it or it will return -1
                                * Same goes if number is on left side start will remain same but end will
                                * decrease eventually crosses start
                                * and becomes negative start will then be greater than end while loop stops
                                * entire left portion checked
                                */
            int mid = (start + end) / 2;
            if (k == array[mid]) {
                return mid;
            } else if (k > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 9, 11, 15, 20, 41, 99, 100, 125 };
        int n = biSearch(arr, 20);
        if (n != -1) {
            System.out.println("Element is at the Index: " + n);
        } else {
            System.out.println("Not Found!");
        }
    }
}
