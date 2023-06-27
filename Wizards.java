public abstract class Wizards extends BasicHero{

    public Wizards(int id, int healthLevel, String name, String type, int initiative, int heal) {
        super(id, healthLevel, name, type, initiative);
        this.heal = heal;
    }
    public int heal;

    @Override
    public String toString() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " "
                + "INITIATIVE = " + initiative + " " + "HEAL = " + heal);
    }
}
