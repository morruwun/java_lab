package defence;

import java.util.Random;

public class Wall extends Defence{
    private int length, le;
    private int width, wi;
    private int height, he;
    private int numOfSoldiers;
    private int hits = 0;
    private boolean destroyed;

    public Wall(int length, int width, int height, int numOfSoldiers) {
        this.le = this.length = length;
        this.wi = this.width = width;
        this.he = this.height = height;
        this.numOfSoldiers = numOfSoldiers;
    }

    public void setHits(int h) {hits = h;}
    public boolean hit() {
        hits++;
        return destroyBuilding();
    }
    public boolean destroyBuilding(){
        if(hits == length) {
            destroyed = true;
            setWall(0, 0, 0, 0);
        }
        return destroyed;
    }

    public void setWall(int l, int w, int h, int n) {
        le = length = l;
        wi = width = w;
        he = height = h;
        numOfSoldiers = n;
    }
    public int getLength() {return length;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public int getNumOfSoldiers() {return numOfSoldiers;}
    public int getLe() {return le;}
    public int getWi() {return wi;}
    public int getHe() {return he;}

    public void setWall() {
        int minl = 500;
        int maxl = 1000;
        int diffl = maxl - minl;
        Random randoml = new Random();
        length = randoml.nextInt(diffl + 1);
        length += minl;
        le = length;

        int minw = 5;
        int maxw = 10;
        int diffw = maxw - minw;
        Random randomw = new Random();
        width = randomw.nextInt(diffw + 1);
        width += minw;
        wi = width;

        int minh = 7;
        int maxh = 20;
        int diffh = maxh - minh;
        Random randomh = new Random();
        height = randomh.nextInt(diffh + 1);
        height += minh;
        he = height;

        int mins = 500;
        int maxs = 2000;
        int diffs = maxs - mins;
        Random random = new Random();
        numOfSoldiers = random.nextInt(diffs + 1);
        numOfSoldiers += mins;
    }

    public void repair() {
        length = le;
        width = wi;
        height = he;
    }
}
