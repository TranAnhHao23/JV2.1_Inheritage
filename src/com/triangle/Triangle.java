package com.triangle;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.time.Period;

public class Triangle extends Shape {
    double c = 1;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public boolean checkTriangle() {
        if (getA() + getB() > c && getB() + c > getA() && getA() + c > getB()) {
            return true;
        } else {
            return false;
        }
    }

    public void getArea() {
        if (checkTriangle()) {
            double p = (getA() + getB() + this.c) / 2;
            System.out.println(
                    "Area = " + (Math.sqrt(p * (p - getA()) * (p = getB()) * (p - this.c)))
            );
        }
        else {
            System.out.println("Not a triangle");
        }

    }

    public void getPerimeter() {
        if (checkTriangle()) {
            System.out.println("Perimeter = " + (getA() + getB() + this.c));
        } else{
            System.out.println("Not a triangle");
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                '}';
    }
}
