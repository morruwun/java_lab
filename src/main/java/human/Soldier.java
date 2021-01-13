package human;

import defence.Weapon;

public class Soldier implements Human{
    private int amount;
    private String soldierType;
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }
    public int getAmount() {
        return amount;
    }
    public String getSoldierType() {return soldierType;}

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Soldier(int amount, String soldierType) {
        this.amount = amount;
        this.soldierType = soldierType;
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
