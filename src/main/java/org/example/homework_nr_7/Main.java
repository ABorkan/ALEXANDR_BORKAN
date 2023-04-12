package org.example.homework_nr_7;

import org.example.homework_nr_7.Part_1.Staff;
import org.example.homework_nr_7.Part_1.Student;
import org.example.homework_nr_7.Part_2.*;

public class Main {
    public static void main(String[] args) {

        Student someStudent = new Student("Alex", "Buiucani", "Java", 35, 15.6);
        System.out.println(someStudent);

        Staff someStaff = new Staff("Alexei", "Ciocana", "Puskin", 35000);
        System.out.println(someStaff);

        Sphere newSphere = new Sphere(12);
        Cube newCube = new Cube(11);

        ThreeDimensionalShape[] arrayThree = new ThreeDimensionalShape[]{newSphere, newCube};

        for (ThreeDimensionalShape element :
                arrayThree) {
            if(element instanceof Cube){
               Cube buffer = (Cube) element;
               buffer.getArea();
               buffer.getVolume();
            }
            if(element instanceof Sphere){
                Sphere buffer = (Sphere) element;
                buffer.getArea();
                buffer.getVolume();
            }
        }

        Circle newCircle = new Circle(3);
        Square newSquare = new Square(4);
        TwoDimensionalShape[] arrayTwo = new TwoDimensionalShape[]{newSquare, newCircle};

        for (TwoDimensionalShape element :
                arrayTwo
             ) {
            if(element instanceof Circle){
                ((Circle) element).getArea();
            }
            if(element instanceof Square){
                ((Square) element).getArea();
            }
        }

    }


}
