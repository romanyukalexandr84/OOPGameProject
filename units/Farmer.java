package units;

import java.util.ArrayList;

public class Farmer extends BasicHero {
    public Farmer(String name, int x, int y) {
        super(5, 100, name, "Farmer", 4, x, y);
    }

    @Override
    public String getInfo() {
        return (name + " " + type + " " + (char)9829 + healthLevel + " " + (char)9733 + initiative);
    }

    public boolean busy = false;

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.healthLevel > 0) this.busy = false;
    }
}