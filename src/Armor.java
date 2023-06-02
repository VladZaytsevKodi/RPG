
// Базовый класс защиты
abstract class Armor {
    protected String name;
    protected int defense;

    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }
}
