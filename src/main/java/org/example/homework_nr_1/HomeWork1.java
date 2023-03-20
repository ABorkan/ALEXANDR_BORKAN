package org.example.homework_nr_1;

public class HomeWork1 {
    public static void main(String[] args){
        System.out.println("Hello World!");

        //Добавим переменные
        long    CurrentWorldPopulation   = 7811080815L;
        int     CarsProducedThisYear     = 55235358;
        char    FirstLetterInAlphabet    = 'A';
        boolean JavaIsAmazing            = true;
        float   Pi                       = 3.14159f;

        //Выведем все переменные
        System.out.println("Current World Population - " + CurrentWorldPopulation);
        System.out.println("Cars Produced This Year - " + CarsProducedThisYear);
        System.out.println("First Letter In Alphabet - " + FirstLetterInAlphabet);
        System.out.println("Java Is Amazing - " + JavaIsAmazing);
        System.out.println("Pi - " + Pi);

        //определим и инициализируем след переменные
        double Price    = 10.35;
        double Tax      = 2.2;
        int    Quantity = 43;
        double Sum      = 0;

        double total = Price + Tax * Quantity + Sum;

        //Выведем на экран total
        System.out.println("Total = " + total);
    }
}
