package units;

import java.util.ArrayList;

public class Farmer extends BasicHero {
    public Farmer(String name, int x, int y ) {
        super(5, 100, name, "units.Farmer", 10, x, y);
    }

    @Override
    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " "
                + "INITIATIVE = " + initiative + " " + "X = " + place.x + " " + "Y = " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int[] temp = findNearEnemy(enemies);
        System.out.println("DISTANCE = " + temp[0] + " ENEMY'S NAME " + enemies.get(temp[1]).name);
    }
}