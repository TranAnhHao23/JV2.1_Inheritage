package com.moveable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Point a = new Point(2, 3);
//        System.out.println(a);
        MoveablePoint a = new MoveablePoint();
        System.out.println(Arrays.toString(a.getSpeed()));

        a.setSpeed(2,3);
//        System.out.println(Arrays.toString(a.getSpeed()));
//        for (int i = 0; i < a.speed.length; i++) {
//            System.out.print(a.speed[i] + " ");
//        }
        System.out.println(a.move());
        a.setSpeed(2,3);

        System.out.println(a.move());






//        System.out.println(a.getX());
//        System.out.println(a.getY());
    }

}
