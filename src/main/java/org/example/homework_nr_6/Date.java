package org.example.homework_nr_6;

import java.util.Calendar;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {

        int maxDay = getDayOfMonth(month,year);

        if(day > 0 && day <= maxDay)
            this.day = day;
        else
            System.err.println("В веденном Вами месяце может быть от 1 до " + maxDay + " дней");

        if(month>1 && month <= 12)
            this.month = month;
        else
            System.err.println("Введеное Вами число " + month + " не попадает в диапазон от 1 до 12 ");

        if(year>1000)
            this.year = year;
        else
            System.err.println("Год не может быть меньше 1000");

    }

    public int getDayOfMonth(int month, int year){
       Calendar myCalendar = Calendar.getInstance();
       myCalendar.set(year,month-1,1);
       return myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public void setDay(int day) {
        int maxDay = getDayOfMonth(this.month,this.year);
        if(day > 0 && day <= maxDay)
            this.day = day;
        else
            System.err.println("В веденном Вами месяце может быть от 1 до " + maxDay + " дней");
    }

    public void setMonth(int month) {
        if(month>1 && month <= 12)
            this.month = month;
        else
            System.err.println("Введеное Вами число " + month + " не попадает в диапазон от 1 до 12 ");
    }

    public void setYear(int year) {
        if(year>1000)
            this.year = year;
        else
            System.err.println("Год не может быть меньше 1000");
    }

    public void displayDate(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

}
