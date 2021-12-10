package com.geometric;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        super.setWidth(size);
        super.setHeight(size);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }


}
