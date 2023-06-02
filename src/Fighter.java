
// Базовый класс персонажа
abstract class Fighter {
    protected String name;
    protected int health;
    protected Weapon weapon;
    protected Armor armor;

    public Fighter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void equipWeapon(Weapon weapon) {
        if (weapon.isCompatible(this)) {
            this.weapon = weapon;
            System.out.println(name + " взял " + weapon.getName());
        } else {
            System.out.println(name + " не может взять это оружие");
        }
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " надел " + armor.getName());
    }

    public abstract void attack();

    public void takeDamage(int damage) {
        int totalDamage = Math.max(0, damage - armor.getDefense());
        health -= totalDamage;
        if (health <= 0) {
            System.out.println(name + " погиб");
        } else {
            System.out.println(name + " получил " + totalDamage + " урона");
        }
    }
}