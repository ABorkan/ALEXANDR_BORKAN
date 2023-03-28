package org.example.homework_nr_3;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea(){
      return  Math.PI * (radius * radius);

    }

    public static void main(String[] args) {
        Circle radius = new Circle(8);
        System.out.println("Площадь круга равна " + radius.calculateArea() + " см^2");
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