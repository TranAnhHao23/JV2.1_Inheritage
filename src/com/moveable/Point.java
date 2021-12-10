package com.moveable;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
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
        double[] xy = new double[2];
        xy[0] = getX();
        xy[1] = getY();
        return xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x= " + x +
                ", y= " + y +
                '}';
    }
}
