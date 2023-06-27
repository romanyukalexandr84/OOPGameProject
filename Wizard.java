public abstract class Wizard extends BasicHero{

    public Wizard(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int heal) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.heal = heal;
    }
    public int heal;

    @Override
    public String toString() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " "
                + "ATTACK = " + attackLevelBase + " " + "INITIATIVE = " + initiative + " " + "HEAL = " + heal);
    }
}
