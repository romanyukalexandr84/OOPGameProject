package units;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero {

    public Shooters(int id, int healthLevel, String name, String type, int initiative, int attackLevelBase, int x, int y) {
        super(id, healthLevel, name, type, initiative, x, y);
        this.attackLevelBase = attackLevelBase;
    }

    public int attackLevelBase;

    @Override
    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " "
                + "INITIATIVE = " + initiative + " " + "ATTACK = " + attackLevelBase + " " + "X = " + place.x + " " + "Y = " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int[] temp = findNearEnemy(enemies);
        System.out.println("DISTANCE = " + temp[0] + " ENEMY'S NAME " + enemies.get(temp[1]).name);
    }
}