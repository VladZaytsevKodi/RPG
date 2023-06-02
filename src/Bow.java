
// Класс Лук
class Bow extends Weapon {
    public Bow(String name) {
        super(name);
    }

    @Override
    public boolean isCompatible(Fighter fighter) {
        return fighter instanceof Archer;
    }
}
