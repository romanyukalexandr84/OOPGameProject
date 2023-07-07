package units;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero {

    public Shooters(int id, int healthLevel, String name, String type, int initiative, int attackLevelBase, int shoots, int x, int y) {
        super(id, healthLevel, name, type, initiative, x, y);
        this.attackLevelBase = attackLevelBase;
        this.shoots = shoots;
    }

    public int attackLevelBase;
    protected int shoots;

    @Override
    public String getInfo() {
        return ("NAME: " + name + " TYPE: " + type + " ID = " + id + " HEALTH = " + healthLevel
                + " INITIATIVE = " + initiative + " ATTACK = " + attackLevelBase + " SHOOTS = " + shoots + " X = " + place.x + " Y = " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.healthLevel <=0 || this.shoots == 0) return;

        BasicHero nearestEnemy = findNearEnemy(enemies);
        nearestEnemy.healthLevel = nearestEnemy.healthLevel - this.attackLevelBase;

        for (BasicHero item : ours) {
            if (item.type.contains("Farmer")) return;
        }
        this.shoots--;
    }
}