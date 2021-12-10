package com.point;

public class Point3D extends Point2D {
        double z;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z){
        super.setXY(x,y);
        setZ(z);
    }

    public double[] getXYZ(){
        double[] arrays = new double[3];
        arrays[0] = getX();
        arrays[1] = getY();
        arrays[2] = getZ();
        return arrays;
    }

    @Override
    public String toString() {
        return  "Point3D{ " +
                "z= " + z +
                super.toString();
    }
}
