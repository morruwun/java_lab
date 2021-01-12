package defence;

public class Weapon extends Defence{
    private int amount;
    private WeaponType weaponType;

    public Weapon(int amount, WeaponType wType) {
        this.amount = amount;
        weaponType = wType;
    }

    public int getAmount() {
        return amount;
    }

    public void produceWeapon() {
        amount += 20;
        System.out.println("there are " + amount + " items of " + weaponType);
    }


    public void defence() {
        System.out.println("The weapon is used for defencing the castle");
        amount -= 10;
    }
}
