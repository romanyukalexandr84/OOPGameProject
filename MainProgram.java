import units.*;

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
                    alliance.add(new Mag(getName(), 0, new Random().nextInt(0, 50)));
                    empire.add(new Monk(getName(), 9, new Random().nextInt(0, 50)));
                }
                case 1 -> {
                    alliance.add(new Lancer(getName(), 0, new Random().nextInt(0, 50)));
                    empire.add(new Thief(getName(), 9, new Random().nextInt(0, 50)));
                }
                case 2 -> {
                    alliance.add(new Sniper(getName(), 0, new Random().nextInt(0, 50)));
                    empire.add(new Archer(getName(), 9, new Random().nextInt(0, 50)));
                }
                default -> {
                    alliance.add(new Farmer(getName(), 0, new Random().nextInt(0, 50)));
                    empire.add(new Farmer(getName(), 9, new Random().nextInt(0, 50)));
                }
            }
        }
        System.out.println("Alliance:");
        alliance.forEach(item -> System.out.println(item.getInfo()));
        System.out.println("Empire:");
        empire.forEach(item -> System.out.println(item.getInfo()));

        System.out.println("Alliance enemies:");
        alliance.forEach(item -> item.step(empire));
        System.out.println("Empire enemies:");
        empire.forEach(item -> item.step(alliance));
    }
}
