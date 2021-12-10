package com.moveable;

public class MoveablePoint extends Point {
    double xSpeed;
    double ySpeed;
    double[] speed = {getX(), getY()};

    public MoveablePoint() {
    }

    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        speed[0] +=xSpeed;
        speed[1] +=ySpeed;
    }

    public double[] getSpeed() {
        return speed;
    }

    public String move(){

        return " MoveablePoint{" +
                "x= " + speed[0] +
                ", y= " + speed[1] +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() +
                " MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
