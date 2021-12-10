package com.point;

import java.util.Arrays;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }

    public double[] getXY(){
        double[] arrays = new double[2];
        arrays[0] = getX();
        arrays[1] = getY();
        return arrays;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x= " + x +
                ", y= " + y +
                '}';
    }
}
