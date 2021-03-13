package ex4;

public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point() {
    }

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    public double distance(){
        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY,2));
    }
    public double distance(Point p2){
        return Math.sqrt(Math.pow(coordinateX- p2.coordinateX, 2) + Math.pow(coordinateY- p2.coordinateY,2));
    }
    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCordinateY() {
        return coordinateY;
    }

    public void setCordinateY(double cordinateY) {
        this.coordinateY = cordinateY;
    }
}

