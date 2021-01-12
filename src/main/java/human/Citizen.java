package human;

import java.util.Random;

public class Citizen implements Human{
    private int amount;
    public Citizen(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void showHuman() {
        System.out.println("Citizen amount: " + amount);
    }

    public int eat(int food) {
        System.out.println("Citizens eat");
        return food - amount;
    }
    public int produceFood(int food) {
        int minfood = 30;
        int maxfood = 1000;
        int difffood = maxfood - minfood;
        Random randomfood = new Random();
        int nfood = randomfood.nextInt(difffood + 1);
        nfood += minfood;
        food += nfood;
        return food;
    }
}
