import java.util.ArrayList;
import java.util.Random;

public class MainProgram {

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
    public static void main(String[] args) {

        ArrayList<BasicHero> alliance = new ArrayList<>();
        ArrayList<BasicHero> empire = new ArrayList<>();

        for (int count = 0; count < 10; count++) {
            int newCharacter = new Random().nextInt(0, 4);
            switch (newCharacter) {
                case 0 -> {
                    alliance.add(new Mag(getName()));
                    empire.add(new Monk(getName()));
                }
                case 1 -> {
                    alliance.add(new Lancer(getName()));
                    empire.add(new Thief(getName()));
                }
                case 2 -> {
                    alliance.add(new Sniper(getName()));
                    empire.add(new Archer(getName()));
                }
                default -> {
                    alliance.add(new Farmer(getName()));
                    empire.add(new Farmer(getName()));
                }
            }
        }
        System.out.println("Alliance:");
        alliance.forEach(item -> System.out.println(item.getInfo()));
        System.out.println("Empire:");
        empire.forEach(item -> System.out.println(item.getInfo()));
    }
}
