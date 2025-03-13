import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(listSize(list));
    }

    public static int listSize(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        list.removeFirst();

        return 1 + listSize(list);
    }
}