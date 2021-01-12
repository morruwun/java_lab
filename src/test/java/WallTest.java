import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import defence.Wall;

public class WallTest {
    @Test
    public void IsNotDestroyedIfHitsLessThenLengthOfWall() {
        Wall wall = new Wall(0, 0, 0, 0);
        wall.setWall();
        boolean destroyed = wall.hit();
        assertFalse(destroyed);
    }

    @Test
    public void IsDestroyedIfHitsEqualLength() {
        Wall wall = new Wall(0, 0, 0, 0);
        wall.setWall();
        wall.setHits(wall.getLength());
        boolean destroyed = wall.destroyBuilding();
        assertTrue(destroyed);
    }

    @Test
    public void RandomizedWallValuesAreInBoundaries() {
        Wall wall = new Wall(0, 0, 0, 0);
        wall.setWall();
        assertTrue(wall.getLength() >= 500 && wall.getLength() <= 1000);
        assertTrue(wall.getWidth() >= 5 && wall.getWidth() <= 10);
        assertTrue(wall.getHeight() >= 7 && wall.getHeight() <= 20);
        assertTrue(wall.getNumOfSoldiers() >= 500 && wall.getNumOfSoldiers() <= 2000);
    }

    @Test
    public void WallValuesAreTheSameAsTheyWereBeforeAfterRepairing() {
        Wall wall = new Wall(0, 0, 0, 0);
        wall.setWall();
        wall.setHits(wall.getLength());
        wall.destroyBuilding();
        wall.repair();
        assertEquals(wall.getLe(), wall.getLength());
        assertEquals(wall.getWi(), wall.getWidth());
        assertEquals(wall.getHe(), wall.getHeight());
    }
}
