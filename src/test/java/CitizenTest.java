import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import human.Citizen;

import java.util.Random;

public class CitizenTest {
    int minfood = 300;
    int maxfood = 1000;
    int difffood = maxfood - minfood;
    Random randomfood = new Random();
    int food = randomfood.nextInt(difffood + 1) + minfood;

    @Test
    public void AmountOfFoodDecreasesByAmountOfCitizensAfterEating() {
        Citizen citizen = new Citizen(200);
        assertEquals(food - citizen.getAmount(), citizen.eat(food));
    }

    @Test
    public void AmountOfProducedFoodIsInBoundaries() {
        Citizen citizen = new Citizen(200);
        int prodFood = citizen.produceFood(food);
        assertTrue(prodFood - food >=30 && prodFood - food <= 1000);
    }
}
