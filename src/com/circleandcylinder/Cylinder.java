package com.circleandcylinder;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public double getArea(){
        return 2* Math.PI * super.getRadius() * (super.getRadius() + this.height);
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height= " +
                super.toString() +
                '}';
    }
}
