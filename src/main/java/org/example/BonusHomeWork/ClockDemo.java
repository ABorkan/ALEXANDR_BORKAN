package org.example.BonusHomeWork;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ClockDemo {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите секунды: ");
        int a = in.nextInt();
        Clock firstClock = new Clock();
        firstClock.setClock(a);

        System.out.println("Введите часы: ");
        int hours = in.nextInt();
        System.out.println("Введите минуты: ");
        int minutes = in.nextInt();
        System.out.println("Введите секунды: ");
        int seconds = in.nextInt();

        in.close();
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i != 10; i++){
            firstClock.tick();
        }

        Clock secondClock = new Clock(hours, minutes, seconds);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        for(int i = 0; i != 10; i++){
            secondClock.tickDown(secondClock);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        firstClock.addClock(secondClock);

        firstClock.subtractClock(secondClock);

        System.out.println("First clock - " + firstClock);
        System.out.println("Second Clock - " + secondClock);

    }
}
