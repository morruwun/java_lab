import human.ServantType;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import human.Servant;

import java.util.Random;

public class ServantTest {
    int minfood = 300;
    int maxfood = 1000;
    int difffood = maxfood - minfood;
    Random randomfood = new Random();
    int food = randomfood.nextInt(difffood + 1) + minfood;

    @Test
    public void AmountOfFoodDecreasesBy1AfterEating() {
        Servant servant = new Servant(55, "Laura Green", ServantType.NANNY);
        assertEquals(food - 1, servant.eat(food));
    }
}
