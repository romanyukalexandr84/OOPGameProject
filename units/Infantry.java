package units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {

    public Infantry(int id, int healthLevel, String name, String type, int initiative, int attackLevelBase, int x, int y) {
        super(id, healthLevel, name, type, initiative, x, y);
        this.attackLevelBase = attackLevelBase;
    }

    public int attackLevelBase;

    @Override
    public String getInfo() {
        return (name + " " + type + " " + (char)9829 + healthLevel + " " + (char)9733 + initiative + " " + (char)9876 + attackLevelBase);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

    }
}