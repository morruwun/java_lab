import defence.Weapon;
import defence.WeaponType;
import human.Soldier;
import human.SoldierType;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

public class SoldierTest {
    int minfood = 300;
    int maxfood = 1000;
    int difffood = maxfood - minfood;
    Random randomfood = new Random();
    int food = randomfood.nextInt(difffood + 1) + minfood;

    @Test
    public void AmountOfFoodDecreasesByAmountOfSoldiersAfterEating() {
        Soldier soldier = new Soldier(200, SoldierType.KNIGHT);
        assertEquals(food - soldier.getAmount(), soldier.eat(food));
    }

    @Test
    public void AmountOfSoldiersAndWeaponDecreaseWhenDefencing() {
        Soldier soldier = new Soldier(200, SoldierType.KNIGHT);
        Weapon soldierWep = new Weapon(200, WeaponType.SWORD);
        soldier.setWeapon(soldierWep);
        soldier.defence();
        assertEquals(190, soldier.getAmount());
        assertEquals(190, soldierWep.getAmount());
    }
}
