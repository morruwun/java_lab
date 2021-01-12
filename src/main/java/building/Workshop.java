package building;

import java.util.Random;

public class Workshop extends Building{
    private WorkshopType workshopType;
    private int hits = 0;
    private boolean destroyed;

    public int getLength() {return length;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}

    public void setHits(int h) {hits = h;}
    public boolean hit() {
        hits++;
        return destroyBuilding();
    }
    public boolean destroyBuilding(){
        if(hits == 2) {
            destroyed = true;
            setWorkshop(0, 0, 0);
        }
        return destroyed;
    }

    public Workshop(int length, int width, int height, WorkshopType wType) {
        this.length = length;
        this.width = width;
        this.height = height;
        workshopType = wType;
    }

    public void setWorkshop(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public void setWorkshop() {
        int minl = 10;
        int maxl = 25;
        int diffl = maxl - minl;
        Random randoml = new Random();
        length = randoml.nextInt(diffl + 1);
        length += minl;

        int minw = 10;
        int maxw = 25;
        int diffw = maxw - minw;
        Random randomw = new Random();
        width = randomw.nextInt(diffw + 1);
        width += minw;

        int minh = 5;
        int maxh = 10;
        int diffh = maxh - minh;
        Random randomh = new Random();
        height = randomh.nextInt(diffh + 1);
        height += minh;
    }

    public int produceStuff(int stuff) {
        return stuff += 10;
    }
}
