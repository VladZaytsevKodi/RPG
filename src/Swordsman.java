
// Класс Меченосец
class Swordsman extends Fighter {
    public Swordsman(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        if (weapon != null) {
            System.out.println(name + " атакует с помощью " + weapon.getName());
        } else {
            System.out.println(name + " атакует без оружия");
        }
    }
}