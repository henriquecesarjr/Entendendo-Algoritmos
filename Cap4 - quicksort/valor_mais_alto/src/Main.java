import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {2, 6, 9, 10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(findMax(list));
    }

    public static int findMax(ArrayList<Integer> list) {

        if (list.isEmpty()) {
            return 0;
        }

        if (list.size() == 1) {
            return list.getFirst();
        }

        int firstElement = list.removeFirst();
        int maxInRest = findMax(list);

        return Math.max(firstElement, maxInRest);
    }
}