package org.example.homework_nr_8;

public interface Animal {

    void Region();

    default void defMetod(){
        System.out.println("This is default metod");
    };

    static void statMetod(){
        System.out.println("This is static metod");
    };

    void metod3();

    void metod4();
}
