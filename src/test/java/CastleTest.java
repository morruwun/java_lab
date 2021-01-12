import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import building.Castle;

public class CastleTest {
    @Test
    public void IsNotDestroyedIfHitsLessThen5() {
        Castle castle = new Castle(0, 0, 0);
        castle.setCastle();
        boolean destroyed = castle.hit();
        assertFalse(destroyed);
    }

    @Test
    public void IsDestroyedIfHitsEquals5() {
        Castle castle = new Castle(0, 0, 0);
        castle.setCastle();
        castle.setHits(5);
        boolean destroyed = castle.destroyBuilding();
        assertTrue(destroyed);
    }

    @Test
    public void RandomizedCastleValuesAreInBoundaries() {
        Castle castle = new Castle(0, 0, 0);
        castle.setCastle();
        assertTrue(castle.getLength() >= 200 && castle.getLength() <= 600);
        assertTrue(castle.getWidth() >= 200 && castle.getWidth() <= 600);
        assertTrue(castle.getHeight() >= 10 && castle.getHeight() <= 60);
    }
}
