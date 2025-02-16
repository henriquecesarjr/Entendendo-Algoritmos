import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));

        System.out.println(sortBySelection(test));
    }

    public static int findSmaller(List<Integer> arr) {
        int smaller = arr.getFirst();
        int lowestIndex = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smaller) {
                smaller = arr.get(i);
                lowestIndex = i;
            }
        }

        return lowestIndex;
    }

    public static List<Integer> sortBySelection(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();

        while (!arr.isEmpty()) {
            int smaller = findSmaller(arr);
            newArr.add(arr.remove(smaller));
        }

        return newArr;
    }
}