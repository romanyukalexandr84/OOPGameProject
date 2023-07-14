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
        return (name + " " + type + " " + (char)9829 + healthLevel + " " + (char)9733 + initiative + " " + (char)9876 + attackLevelBase + " " + (char)9889 + shoots);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.healthLevel <=0 || this.shoots == 0) return;

        BasicHero nearestEnemy = findNearEnemy(enemies);
        nearestEnemy.getDamage(this.attackLevelBase);

        for (BasicHero item : ours) {
            if (item.type.contains("Farmer") && !((Farmer)(item)).busy && item.healthLevel > 0) {
                ((Farmer)(item)).busy = true;
                return;
            }
        }
        this.shoots--;
    }
}