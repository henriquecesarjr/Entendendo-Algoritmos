public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));;
    }

    private static int factorial(int x) {
        if (x == 1 || x == 0) {
            return 1;
        }else {
            return x * factorial(x-1);
        }
    }
}