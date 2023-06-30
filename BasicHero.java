public abstract class BasicHero implements Actions{
    int id;
    int healthLevel;
    String name;
    String type;
    int initiative;

    public BasicHero(int id, int healthLevel, String name, String type, int initiative) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.initiative = initiative;
    }
}
