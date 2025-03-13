import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {2, 6, 9, 10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(sum(list));
    }

    public static Integer sum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer index = list.removeLast();

        return index + sum(list);
    }
}