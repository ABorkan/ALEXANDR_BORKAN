package org.example.homework_nr_7.Part_2;

public class Sphere extends ThreeDimensionalShape {

    int r;

    public Sphere(int r) {
        this.r = r;
    }

    public  void getVolume(){
        double v;
        v = 4/3* Math.PI* this.r;
        System.out.println("Volume Sphere: "+v);
    }
    public void getArea(){
        double s;
        s = 4*Math.PI*(r*r);
        System.out.println("Area Sphere: "+s);
    }
}
