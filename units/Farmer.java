package units;

import java.util.ArrayList;

public class Farmer extends BasicHero {
    public Farmer(String name, int x, int y ) {
        super(5, 100, name, "units.Farmer", 4, x, y);
    }

    @Override
    public String getInfo() {
        return ("NAME: " + name + " TYPE: " + type + " ID = " + id + " HEALTH = " + healthLevel
                + " INITIATIVE = " + initiative + " X = " + place.x + " Y = " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

    }
}