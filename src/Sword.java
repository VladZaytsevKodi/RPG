
// Класс Меч
class Sword extends Weapon {
    public Sword(String name) {
        super(name);
    }

    @Override
    public boolean isCompatible(Fighter fighter) {
        return fighter instanceof Swordsman;
    }
}