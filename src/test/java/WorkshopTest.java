import building.WorkshopType;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import building.Workshop;

public class WorkshopTest {
    @Test
    public void AmountOfStuffIs10ItemsMoreAfterProduction(){
        Workshop workshop = new Workshop(0, 0, 0, WorkshopType.SHOEMAKER);
        workshop.setWorkshop();
        int stuff = 50;
        stuff = workshop.produceStuff(stuff);
        assertEquals(60, stuff);
    }

    @Test
    public void IsNotDestroyedIfHitsAreLessThen2() {
        Workshop workshop = new Workshop(0, 0, 0, WorkshopType.SHOEMAKER);
        workshop.setWorkshop();
        boolean destroyed = workshop.hit();
        assertFalse(destroyed);
    }

    @Test
    public void IsDestroyedIfHitsEqual2() {
        Workshop workshop = new Workshop(0, 0, 0, WorkshopType.SHOEMAKER);
        workshop.setWorkshop();
        workshop.setHits(2);
        boolean destroyed = workshop.destroyBuilding();
        assertTrue(destroyed);
    }

    @Test
    public void RandomizedWorkshopValuesAreInBoundaries() {
        Workshop workshop = new Workshop(0, 0, 0, WorkshopType.SHOEMAKER);
        workshop.setWorkshop();
        assertTrue(workshop.getLength() >= 10 && workshop.getLength() <= 25);
        assertTrue(workshop.getWidth() >= 10 && workshop.getWidth() <= 25);
        assertTrue(workshop.getHeight() >= 5 && workshop.getHeight() <= 10);
    }
}
