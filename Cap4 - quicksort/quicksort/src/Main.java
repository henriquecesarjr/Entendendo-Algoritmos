import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {10, 5, 2, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(quicksort(list));
    }

    public static ArrayList<Integer> quicksort(ArrayList<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        Random rand = new Random();
        Integer pivot = list.get(rand.nextInt(list.size()));
        ArrayList<Integer> minors = new ArrayList<>();
        ArrayList<Integer> equals = new ArrayList<>();
        ArrayList<Integer> bigger = new ArrayList<>();

        for (Integer item : list) {
            if (item < pivot) {
                minors.add(item);
            } else if (item > pivot) {
                bigger.add(item);
            } else {
                equals.add(item);
            }
        }

        ArrayList<Integer> result = new ArrayList<>(quicksort(minors));
        result.addAll(equals);
        result.addAll(quicksort(bigger));

        return result;
    }
}