package com.company;

public class Cuboid extends Rectangle {

    private double depth;

    public Cuboid(double width, double length, double depth) {
        super(width, length);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public double getVolume(){
        return getArea() * depth;
    }
}
