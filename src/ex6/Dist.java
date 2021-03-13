package ex6;

public abstract class Dist {
    private double dist;

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        if (dist>0) {
            this.dist = dist;
        }
        else{
            System.out.println("Not valid dist");
        }
    }
}
