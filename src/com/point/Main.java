package com.point;

public class Main {
    public static void main(String[] args) {
        Point2D xy = new Point2D(2,3);
        double[] arrXY = xy.getXY();
        for (int i = 0; i < arrXY.length; i++) {
            System.out.print(arrXY[i] + " ");
        }

        Point3D xyz = new Point3D(3,4,5);
        double[] arrXYZ = xyz.getXYZ();
        for (int i = 0; i < arrXYZ.length; i++) {
            System.out.print(arrXYZ[i] + " ");
        }


    }
}
