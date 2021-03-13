package com.company.ex1;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else{
            System.out.println("Not valid radius");
        }
    }

    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else{
            System.out.println("Not valid radius");
        }
    }
}
