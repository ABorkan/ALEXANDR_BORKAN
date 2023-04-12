package org.example.homework_nr_7.Part_2;

public class Circle extends TwoDimensionalShape{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public void getArea(){
        double s;
        s = Math.PI * (r * r);
        System.out.println("Area circle: " + s);
    }
}
