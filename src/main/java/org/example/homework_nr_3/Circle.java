package org.example.homework_nr_3;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static double calculateArea(int r){
        double p;
        p = Math.PI * (r * r);
        return p;
    }

    public static void main(String[] args) {
        Circle radius = new Circle(8);
        System.out.println("Площадь круга равна " + calculateArea(radius.radius) + " см^2");
    }

}

class TemperatureConverter{
   public static double toCelsius(double x){
         return (x-32)*5/9;
   }

    public static double toFahrenheit(double x){
        return x*9/5+32;
    }
   public static void main(String[] args){
       int cel = 32;
       int fahr = 95;
       System.out.println("Результат преобразования из F в C = " + toCelsius(fahr));
       System.out.println("Результат преобразования из С в F = " + toFahrenheit(cel));
   }

}