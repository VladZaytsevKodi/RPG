///Урок 7. ООП Дизайн и Solid ч.2Продумать систему классов персонажей игры RPG (бойцов) Лучник,
// Меченосец и т.п. Сделать отдельно объекты оружия и защиты, продусмотреть, чтобы каждый боец мог взять
// только свой тип оружия (лучние может взять любой лук, но не меч). Как дополнительно, сделать сражение между
// бойцами.
// Пример использования классов
public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer("Лучник", 100);
        Swordsman swordsman = new Swordsman("Меченосец", 120);

        Bow bow = new Bow("Лук");
        Sword sword = new Sword("Меч");

        LightArmor lightArmor = new LightArmor("Легкая броня", 10);
        HeavyArmor heavyArmor = new HeavyArmor("Тяжелая броня", 20);

        archer.equipWeapon(bow); // Лучник берет лук
        archer.equipWeapon(sword); // Лучник не может брать мечи

        swordsman.equipWeapon(sword); // Меченосец берет меч
        swordsman.equipWeapon(bow); // Меченосец не может брать луки

        archer.equipArmor(lightArmor);
        swordsman.equipArmor(heavyArmor);

        archer.attack();
        swordsman.attack();

        swordsman.takeDamage(15);
        archer.takeDamage(30);
    }
}