import units.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainProgram {

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    static ArrayList<BasicHero> alliance = new ArrayList<>();
    static ArrayList<BasicHero> empire = new ArrayList<>();
    static ArrayList<BasicHero> unitedTeam = new ArrayList<>();

    public static void main(String[] args) {

        for (int count = 1; count < 11; count++) {
            int newCharacter = new Random().nextInt(0, 4);
            switch (newCharacter) {
                case 0 -> {
                    alliance.add(new Mag(getName(), 1, count));
                }
                case 1 -> {
                    alliance.add(new Lancer(getName(), 1, count));
                }
                case 2 -> {
                    alliance.add(new Sniper(getName(), 1, count));
                }
                default -> {
                    alliance.add(new Farmer(getName(), 1, count));
                }
            }
        }

        for (int count = 1; count < 11; count++) {
            int newCharacter = new Random().nextInt(0, 4);
            switch (newCharacter) {
                case 0 -> {
                    empire.add(new Monk(getName(), 10, count));
                }
                case 1 -> {
                    empire.add(new Thief(getName(), 10, count));
                }
                case 2 -> {
                    empire.add(new Archer(getName(), 10, count));
                }
                default -> {
                    empire.add(new Farmer(getName(), 10, count));
                }
            }
        }

        unitedTeam.addAll(alliance);
        unitedTeam.addAll(empire);
        unitedTeam.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());

        Scanner scan = new Scanner(System.in);

        View.view();

        int deadCountAlliance = 0;
        int deadCountEmpire = 0;
        boolean endGame = false;

        while (!endGame) {
            scan.nextLine();
            for (BasicHero item : unitedTeam) {
                if (alliance.contains(item)) {
                    item.step(empire, alliance);
                } else {
                    item.step(alliance, empire);
                }
            }

            View.view();

            for (BasicHero item : alliance) {
                if (item.getHealthLevel() <= 0) {
                    deadCountAlliance += 1;
                }
                if (deadCountAlliance == alliance.size()) {
                    System.out.println("Победила команда Empire");
                    endGame = true;
                }
            }

            for (BasicHero item : empire) {
                if (item.getHealthLevel() <= 0) {
                    deadCountEmpire += 1;
                }
                if (deadCountEmpire == empire.size()) {
                    System.out.println("Победила команда Alliance");
                    endGame = true;
                }
            }
            System.out.println("Убито у Alliance: " + deadCountAlliance);
            System.out.println("Убито у Empire: " + deadCountEmpire);
            deadCountAlliance = 0;
            deadCountEmpire = 0;
        }
    }
}