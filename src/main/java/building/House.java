package building;

import java.util.Random;

public class House extends Building{
    private int amount;
    private int hits = 0;
    private boolean destroyed;

    public House(int length, int width, int height, int amount) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.amount = amount;
    }

    public void setHits(int h) {hits = h;}
    public boolean hit() {
        hits++;
        return destroyBuilding();
    }
    public boolean destroyBuilding(){
        if(hits == amount) {
            destroyed = true;
            setHouse(0, 0, 0, 0);
        }
        return destroyed;
    }

    public void setHouse(int l, int w, int h, int a) {
        length = l;
        width = w;
        height = h;
        amount = a;
    }
    public int getLength() {return length;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public int getAmount() {return amount;}

    public void setHouse() {
        int minl = 20;
        int maxl = 40;
        int diffl = maxl - minl;
        Random randoml = new Random();
        length = randoml.nextInt(diffl + 1);
        length += minl;

        int minw = 10;
        int maxw = 30;
        int diffw = maxw - minw;
        Random randomw = new Random();
        width = randomw.nextInt(diffw + 1);
        width += minw;

        int minh = 2;
        int maxh = 5;
        int diffh = maxh - minh;
        Random randomh = new Random();
        height = randomh.nextInt(diffh + 1);
        height += minh;

        int mina = 40;
        int maxa = 170;
        int diffa = maxa - mina;
        Random randoma = new Random();
        amount = randoma.nextInt(diffa + 1);
        amount += mina;
    }
}
