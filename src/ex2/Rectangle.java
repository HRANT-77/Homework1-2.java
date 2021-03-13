package ex2;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        if(height>0){
            this.height = height;
        }
        else{
            System.out.println("Not valid height");
        }
        if(width>0){
            this.width = width;
        }
        else{
            System.out.println("Not valid width");
        }
    }

    public double calculatePerimeter(){
        return 2*(height+width);
    }
    public double calculateArea(){
        return height*width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height>0){
            this.height = height;
        }
        else{
            System.out.println("Not valid height");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0){
            this.width = width;
        }
        else{
            System.out.println("Not valid width");
        }
    }
}
