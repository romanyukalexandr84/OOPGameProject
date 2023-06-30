public abstract class Infantry extends BasicHero {

    public Infantry(int id, int healthLevel, String name, String type, int initiative, int attackLevelBase) {
        super(id, healthLevel, name, type, initiative);
        this.attackLevelBase = attackLevelBase;
    }

    public int attackLevelBase;

    @Override
    public String getInfo() {
        return ("NAME: " + name + " " + "TYPE: " + type + " " + "ID = " + id + " " + "HEALTH = " + healthLevel + " "
                + "INITIATIVE = " + initiative + " " + "ATTACK = " + attackLevelBase);
    }

    public void step() {
    }
}