package building;

import java.util.Random;

public class Castle extends Building{
    private int hits = 0;
    private boolean destroyed;

    public Castle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public int getLength() {return length;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}

    public void setHits(int h) {hits = h;}
    public boolean hit() {
        hits++;
        return destroyBuilding();
    }
    public boolean destroyBuilding(){
        if(hits == 5) {
            destroyed = true;
            setCastle(0, 0, 0);
        }
        return destroyed;
    }

    public void setCastle(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
    public void setCastle() {
        int minl = 200;
        int maxl = 600;
        int diffl = maxl - minl;
        Random randoml = new Random();
        length = randoml.nextInt(diffl + 1);
        length += minl;

        int minw = 200;
        int maxw = 600;
        int diffw = maxw - minw;
        Random randomw = new Random();
        width = randomw.nextInt(diffw + 1);
        width += minw;

        int minh = 10;
        int maxh = 60;
        int diffh = maxh - minh;
        Random randomh = new Random();
        height = randomh.nextInt(diffh + 1);
        height += minh;
    }


    public class Door {
        boolean open;
        public void openDoor() {
            open = true;
            System.out.println("the door is opened");
        }
        public void closeDoor() {
            open = false;
            System.out.println("the door is closed");
        }
    }
}

