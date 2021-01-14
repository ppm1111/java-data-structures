package sort;

public class BubbleSort {
    public void sort(int[] arr) {
        for (int a = 0;a < arr.length - 1; a++) {
            for (int b = 0;b < arr.length - a - 1; b++) {
                if (arr[b] > arr[b+1]) {
                    swap(arr, b, b+1);
                }
            }
        }
    }
    public void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
