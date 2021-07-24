public class SortingUtil {

    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    public static <T extends Comparable<T>> void swap(T[] arr, int minIndex, int i) {
        T temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }

    //*************************************quickSort method******************************************************
    public static <T extends Comparable<T>> void quickSort(T[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        T pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker].compareTo(pivot) < 0) {
                leftMarker++;
            }
            while (source[rightMarker].compareTo(pivot) > 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap(source, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}