public class Farmer extends BasicHero {
    public Farmer(String name) {
        super(5, 100, name, "Farmer", 10);
    }

    @Override
    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " "
                + "INITIATIVE = " + initiative + " ");
    }

    @Override
    public void step() {
    }
}