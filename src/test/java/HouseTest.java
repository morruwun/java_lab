import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import building.House;

public class HouseTest {
    @Test
    public void IsNotDestroyedIfHitsAreLessThenAmountOfHouses() {
        House house = new House(0, 0, 0, 0);
        house.setHouse();
        boolean destroyed = house.hit();
        assertFalse(destroyed);
    }

    @Test
    public void IsDestroyedIfHitsAreEqualToNumberOfHouses() {
        House house = new House(0, 0, 0, 0);
        house.setHouse();
        house.setHits(house.getAmount());
        boolean destroyed = house.destroyBuilding();
        assertTrue(destroyed);
    }

    @Test
    public void RandomizedHouseValuesAreInBoundaries() {
        House house = new House(0, 0, 0, 0);
        house.setHouse();
        assertTrue(house.getLength() >= 20 && house.getLength() <= 40);
        assertTrue(house.getWidth() >= 10 && house.getWidth() <= 30);
        assertTrue(house.getHeight() >= 2 && house.getHeight() <= 5);
        assertTrue(house.getAmount() >= 40 && house.getAmount() <= 170);
    }
}
