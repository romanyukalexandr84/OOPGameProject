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
        if (this.healthLevel <=0) return;
        BasicHero nearestEnemy = findNearEnemy(enemies);

        if (this.place.calcDistance(nearestEnemy.place) < 2) {
            nearestEnemy.getDamage(this.attackLevelBase);
            return;
        }

        Coordinates temp = new Coordinates(place.x, place.y);
        if (Math.abs(this.place.x-nearestEnemy.place.x) > Math.abs(this.place.y - nearestEnemy.place.y)) {
            if (this.place.x < nearestEnemy.place.x) {
                temp.x += 1;
            } else {
                temp.x -= 1;
            }
        } else {
            if (this.place.y < nearestEnemy.place.y) {
                temp.y +=1;
            } else {
                temp.y -=1;
            }
        }

        //Проверяем, не занята ли клетка (живым членом своей команды), на которую собираемся сходить:
        boolean flag = false;
        for (BasicHero item : ours) {
            if (item.place.x == temp.x & item.place.y == temp.y & item.healthLevel > 0) flag = true;
        }
        if (flag) return;
        this.place.x = temp.x;
        this.place.y = temp.y;
    }
}