package units;

import java.util.ArrayList;

public abstract class Wizards extends BasicHero {

    public Wizards(int id, int healthLevel, String name, String type, int initiative, int heal, int x, int y) {
        super(id, healthLevel, name, type, initiative, x, y);
        this.heal = heal;
    }

    public int heal;

    @Override
    public String getInfo() {
        return (name + " " + type + " " + (char)9829 + healthLevel + " " + (char)9733 + initiative + " " + (char)9752 + heal);
    }

    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.healthLevel > 0) {
            for (BasicHero item : ours) {
                if (item.healthLevel < 99 & item.healthLevel > 0) {
                    item.healthLevel += this.heal;
                    System.out.println("Вылечил: " + item.name);
                    return;
                }
            }
            BasicHero nearestEnemy = findNearEnemy(enemies);
            nearestEnemy.getDamage(this.heal);
            System.out.println("Повредил: " + nearestEnemy.name);
        }
    }
}