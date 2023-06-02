
// Базовый класс оружия
abstract class Weapon {
    protected String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isCompatible(Fighter fighter);
}