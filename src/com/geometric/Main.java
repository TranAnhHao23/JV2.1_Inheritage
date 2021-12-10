package com.geometric;

public class Main {
    public static void main(String[] args) {

////      Test shape
//        Shape newShape = new Shape();
//        Shape newShape2 = new Shape("blue",false);
//        System.out.println(newShape);
//        System.out.println(newShape2);
//
////      Test Circle
//        Circle newCircle = new Circle();
//        System.out.println(newCircle);
//        Circle newCircle2 = new Circle("Red",true,5);
//        System.out.println(newCircle2);
//        System.out.println(newCircle2.getArea());
//        System.out.println(newCircle2.getPerimeter());
//
////      Test Rectangle
//        Rectangle newRec = new Rectangle(2.3,5.8);
//        System.out.println(newRec);
//        System.out.println(newRec.getArea());

//      Test Square
        Square newSquare = new Square();
        System.out.println(newSquare);

        Square newSquare2 = new Square(10);
        System.out.println(newSquare2);
        newSquare2.setSize(5);
        System.out.println(newSquare2.getWidth());

        System.out.println(newSquare2);
//        newSquare2.setHeight(15);
//        newSquare2.setWidth(14);
//        System.out.println(newSquare2);


    }
}
