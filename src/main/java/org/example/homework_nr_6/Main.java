package org.example.homework_nr_6;

import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        Invoice invoiceNr1 = new Invoice("TV Samsung", "4K, i.54", 1, 7854);
        System.out.println("Model: " + invoiceNr1.getModel() + " " + "Description: " + invoiceNr1.getDescription());
        System.out.println("Count: " + invoiceNr1.getAmount() + " " + "Price: "+ invoiceNr1.getPrice());

        Date Data = new Date(31, 12, 2023);
        Data.displayDate();

    }
}
