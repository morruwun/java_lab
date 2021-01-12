package human;

import defence.Weapon;

public class Soldier implements Human{
    private int amount;
    private SoldierType soldierType;
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }
    public int getAmount() {
        return amount;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Soldier(int amount, SoldierType sType) {
        this.amount = amount;
        soldierType = sType;
    }

    public void showHuman() {
        System.out.println(soldierType+":");
        System.out.println("Amount: " + amount);
    }

    public int eat(int food) {
        System.out.println("Soldiers eat");
        return food - amount;
    }

    public void defence() {
        weapon.defence();
        System.out.println("Soldiers are defencing");
        amount -= 10;
    }
}
