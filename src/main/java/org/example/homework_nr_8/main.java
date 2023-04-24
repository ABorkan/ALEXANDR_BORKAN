package org.example.homework_nr_8;

public class main {
    public static void main(String[] args) {

        Animal elephant = new Elephant("Africa");

        elephant.Region();
        elephant.defMetod();
        elephant.metod3();
        elephant.metod4();

        Animal.statMetod();

        System.out.println("------------------------------------");

        Erbivor elephant2 = new Elephant("Asia");

        elephant2.ration();
        elephant2.fff();

    }
}
