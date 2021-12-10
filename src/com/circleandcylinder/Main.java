package com.circleandcylinder;


public class Main {
    public static void main(String[] args) {
//      Test Circle
        Circle newcircle1 = new Circle();
        Circle newcircle2 = new Circle(5, "blue");

        System.out.println(newcircle1);
        System.out.println(newcircle2);
        System.out.println(newcircle2.getArea());


//      Test Cylinder
        Cylinder newcyl1 = new Cylinder(5, "red", 7);
        System.out.println(newcyl1);
        System.out.println(newcyl1.getVolume());
        System.out.println(newcyl1.getArea());


    }
}
