package org.example.homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args){
        //ДЗ пункт 4
        int month = 5;
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            case 0:
                System.out.println("Такого месяца не существует!");
                break;
            default:
                System.out.println("Неправильно введено число!");
                break;
        }

        //ДЗ пункт 5
        for(int i = 100; i <= 1000; i++) {
            if(i%5==0) {
                System.out.println(i);
            }
        }

        //ДЗ пункт 6
        float sum = 0;
        for(float i = 1, r = 3; i<=97 && r<=99; i=i+2, r=r+2){
           sum = i/r + sum;
        }
        System.out.println(sum);

        //ДЗ пункт 7 (Бонус)
        String r = "";
        char z = '*';
        for(int i = 1; i <= 9; i++) {
            r = r+z;
            System.out.println(r);
        }
    }
}