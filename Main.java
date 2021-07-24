import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("before Quick sorting");
        System.out.println(Arrays.toString(list));

        int low = 0;
        int high = list.length - 1;

        SortingUtil.quickSort(list, low, high);
        System.out.println("after Quick sorting");
        System.out.println(Arrays.toString(list));

    }
}
