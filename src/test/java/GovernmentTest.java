import human.GovernType;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import human.Government;

import java.util.Random;

public class GovernmentTest {
    int minfood = 300;
    int maxfood = 1000;
    int difffood = maxfood - minfood;
    Random randomfood = new Random();
    int food = randomfood.nextInt(difffood + 1) + minfood;

    @Test
    public void AmountOfFoodDecreasesBy1AfterEating() {
        Government lord = new Government(50, "Lord ", "Brown", GovernType.LORD.toString());
        assertEquals(food - 1, lord.eat(food));
    }

    @Test
    public void TrueIfTwoObjectsAreEqual() {
        Government lord1 = new Government(50, "Lord ", "Brown", GovernType.LORD.toString());
        Government lord2 = new Government(50, "Lord ", "Brown", GovernType.LORD.toString());
        assertTrue(lord1.equals(lord2));
    }
}
