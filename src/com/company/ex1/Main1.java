package com.company.ex1;

public class Main1 {
    public static void main(String[] args) {
        Circle circle1=new Circle(3);

        System.out.println("Radius is "+circle1.getRadius());
        System.out.println("Perimeter is "+circle1.calculatePerimeter());
        System.out.println("Area is "+circle1.calculateArea());
    }
}
