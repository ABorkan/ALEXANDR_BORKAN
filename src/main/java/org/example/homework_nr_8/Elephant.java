package org.example.homework_nr_8;

public class Elephant extends Erbivor implements Animal {
    String Region;

    public Elephant(String region) {
        Region = region;
    }

    @Override
    public void Region() {
        System.out.println("This is elephant from... " + this.Region);
    }

    @Override
    public void defMetod() {
        System.out.println("This Is Eeeeeeelephant");
    }

    @Override
    public void metod3() {
        System.out.println("metod 3");
    }

    @Override
    public void metod4() {
        System.out.println("metod 4");
    }

    @Override
    public void ration() {
        System.out.println("Ration");
    }
}
