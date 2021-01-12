import defence.WeaponType;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import defence.Weapon;

public class WeaponTest {
    @Test
    public void AmountOfWeaponIs20ItemsMoreAfterProduction() {
        Weapon weapon = new Weapon(100, WeaponType.SWORD);
        weapon.produceWeapon();
        assertEquals(120, weapon.getAmount());
    }

    @Test
    public void AmountOfWeaponIs10ItemsLessAfterDefencing() {
        Weapon weapon = new Weapon(100, WeaponType.SWORD);
        weapon.defence();
        assertEquals(90, weapon.getAmount());
    }
}
