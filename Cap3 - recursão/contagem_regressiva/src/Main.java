public class Main {
    public static void main(String[] args) {
        regressive(10);
    }

    private static void regressive(int i) {
        System.out.println(i);

        if (i <= 1) {
            return;
        } else {
            regressive(i-1);
        }
    }
}