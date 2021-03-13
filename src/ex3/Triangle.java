package ex3;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if(sideA>0){
            this.sideA = sideA;
        }
        else{
            System.out.println("Not valid sideA");
        }

        if(sideB>0){
            this.sideB = sideB;
        }
        else{
            System.out.println("Not valid sideB");
        }

        if(sideC>0){
            this.sideC = sideC;
        }
        else{
            System.out.println("Not valid sideC");
        }

    }

    public double calculatePerimeter(){
        return sideA+sideB+sideC;
    }
    public double calculateArea() {
        double hfOfPerimeter=calculatePerimeter()/2;
        return Math.sqrt(hfOfPerimeter*(hfOfPerimeter-sideA)*(hfOfPerimeter-sideB)*(hfOfPerimeter-sideC));
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if(sideA>0){
            this.sideA = sideA;
        }
        else{
            System.out.println("Not valid sideA");
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if(sideB>0){
            this.sideB = sideB;
        }
        else{
            System.out.println("Not valid sideB");
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if(sideC>0){
            this.sideC = sideC;
        }
        else{
            System.out.println("Not valid sideC");
        }
    }
}
