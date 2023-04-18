package org.example.homework_nr_7.Part_2;

public class Cube extends ThreeDimensionalShape {

    int a;

    public Cube(int a) {
        this.a = a;
    }

    public void getVolume(){
        double v;
        v = a*a*a;
        System.out.println("Area cube: " + v +" cm^3");
    }
    public void getArea(){
        double s;
        s=6*a;
        System.out.println("Volume cube: " + s);
    }
}
