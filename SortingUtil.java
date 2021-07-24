import java.util.List;

public final class SortingUtil {

    private SortingUtil() {

    }

    public static <T extends Comparable<T>> void insertionSort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            swap(list, minIndex, i);
        }
    }

    public static <T extends Comparable<T>> void swap(List<T> list, int minIndex, int i) {
        T temp = list.get(minIndex);
        list.add(minIndex, list.get(i));
        list.remove(minIndex + 1);
        list.add(i, temp);
        list.remove(i + 1);
    }

    //*************************************quickSort method******************************************************
    public static <T extends Comparable<T>> void quickSort(List<T> source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        T pivot = source.get((leftMarker + rightMarker) / 2);
        do {
            while (source.get(leftMarker).compareTo(pivot) < 0) {
                leftMarker++;
            }
            while (source.get(rightMarker).compareTo(pivot) > 0) {
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