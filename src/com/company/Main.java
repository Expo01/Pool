package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0,3.0);
        System.out.println("rectangle area is " + rectangle.getArea());

        System.out.println("");

        Cuboid cuboid = new Cuboid(5.0,5.0,10.0);
        System.out.println("2 dimensional area = " + cuboid.getArea());
        System.out.println("cuboid volume = " + cuboid.getVolume());
    }
}
