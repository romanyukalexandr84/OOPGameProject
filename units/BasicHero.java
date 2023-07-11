package units;

import java.util.ArrayList;

public abstract class BasicHero implements Actions{
    int id;
    int healthLevel;
    String name;
    protected String type;
    protected int initiative;

    public int getInitiative() {
        return initiative;
    }

    protected Coordinates place;

    public BasicHero(int id, int healthLevel, String name, String type, int initiative, int x, int y) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.initiative = initiative;
        place = new Coordinates(x, y);
    }

    public Coordinates getPlace() {
        return place;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }


    protected BasicHero findNearEnemy (ArrayList<BasicHero> enemies) {
        double min = 1000; //изначально берем за минимальное некое большое расстояние
        int count = 0;
        for (int i = 0; i < enemies.size(); i++) {
            if (place.calcDistance(enemies.get(i).place) < min) {
                min = place.calcDistance(enemies.get(i).place);
                count = i;
            }
        }
        return enemies.get(count);
    }
}
