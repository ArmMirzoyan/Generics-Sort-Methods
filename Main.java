import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Test test1 = new Test(38);
        Test test2 = new Test(30);
        Test test3 = new Test(20);
        Test test4 = new Test(19);

        List<Test> list = new ArrayList<>();
        list.add(test1);
        list.add(test2);
        list.add(test3);
        list.add(test4);

        System.out.println("before Quick sorting");
        System.out.println(list);

        int low = 0;
        int high = list.size() - 1;

        SortingUtil.quickSort(list, low, high);
        System.out.println("after Quick sorting");
        System.out.println(list);
    }
}
