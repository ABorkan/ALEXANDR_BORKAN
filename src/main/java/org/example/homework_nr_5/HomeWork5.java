package org.example.homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args){

        Month[] month = Month.values();
        for(int i = 0; i != month.length; i++){
            System.out.println(month[i]);
        }
        System.out.println();
        System.out.println(Weekday.Monday.isHoliday());

        System.out.println();
        System.out.println(Weekday.Sunday.isWeekDay());

        System.out.println();
         try {
             Byte myBayte = new Byte("12");
             System.out.println(myBayte);
         }catch (NumberFormatException e) {
             System.err.println("Данное значение " + e + " невозможно конвертировать в byte");
         }

        System.out.println();
        Boolean myBoolean = new Boolean("sdf");
        System.out.println(myBoolean);

        System.out.println();
        Short myShort = new Short("23456");
        System.out.println(myShort);

        System.out.println();
        Integer myInt = new Integer("147895632");
        System.out.println(myInt);

        System.out.println();
        Long myLong = new Long("987654321987654321");
        System.out.println(myLong);

        System.out.println();
        Double myDouble = new Double("4444.5d");
        System.out.println(myDouble);

        System.out.println();
        Float myFloat = new Float("2354.56f");
        System.out.println(myFloat);

    }
enum Month{
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

}

enum Weekday{
    Monday(false),
    Tuesday(false),
    Wednesday(false),
    Thursday(false),
    Friday(false),
    Saturday(true),
    Sunday(true);

    boolean holiday;

    Weekday(boolean holiday) {
        this.holiday = holiday;
    }

    public boolean isWeekDay(){
        return this.holiday;
    }

    public boolean isHoliday(){
        return this.holiday;
    }
}
}
