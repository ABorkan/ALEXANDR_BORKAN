package org.example.homework_nr_7.Part_2;

public class Square extends TwoDimensionalShape{
    int a;

    public Square(int a) {
        this.a = a;
    }

    public void getArea(){
        double s;
        s = this.a * this.a;
        System.out.println("Area square: " + s);
    }
}
