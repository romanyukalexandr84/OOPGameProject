package units;

import java.util.ArrayList;

public abstract class BasicHero implements Actions{
    int id;
    int healthLevel;
    String name;
    String type;
    int initiative;

    protected Coordinates place;

    public BasicHero(int id, int healthLevel, String name, String type, int initiative, int x, int y) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.initiative = initiative;
        place = new Coordinates(x, y);
    }

    protected int[] findNearEnemy (ArrayList<BasicHero> enemies) {
        double min = 1000; //изначально берем за минимальное некое большое расстояние
        int count = 0;
        for (int i = 0; i < enemies.size(); i++) {
            if (place.calcDistance(enemies.get(i).place) < min) {
                min = place.calcDistance(enemies.get(i).place);
                count = i;
            }
        }
        return new int[]{(int) Math.round(min), count};
    }
}
