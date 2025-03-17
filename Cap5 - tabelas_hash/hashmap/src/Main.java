import java.util.HashMap;

public class Main {

    private static HashMap<String, Boolean> voted = new HashMap<>();

    public static void main(String[] args) {

        checkVoter("Tom");
        checkVoter("Mike");
        checkVoter("Mike");
    }

    public static void checkVoter(String name) {

        if (voted.containsKey(name)) {
            System.out.println("Mande embora");
        } else {
            voted.put(name, true);
            System.out.println("Deixe votar");
        }
    }
}