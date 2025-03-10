public class Main {
    public static void main(String[] args) {
        greet("Henrique");
    }

    private static void greet(String name) {
        System.out.println("Olá, " + name + "!");

        greet2(name);

        System.out.println("Preparando para dizer tchau");

        bye();
    }

    private static void greet2(String name) {
        System.out.println("Como vai " + name + "?");
    }

    private static void bye() {
        System.out.println("ok, tchau!");
    }
}