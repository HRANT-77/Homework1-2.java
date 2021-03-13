package ex4;

public class Main4 {
    public static void main(String[] args) {

        Point point1=new Point(6,8);
        Point point2=new Point(16,26);

        System.out.println("Distance beetwen point1 and (0,0) is "+point1.distance());
        System.out.println("Distance beetwen point1 and point2 is "+point1.distance(point2));

    }
}
