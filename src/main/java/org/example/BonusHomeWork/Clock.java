package org.example.BonusHomeWork;


public class Clock {
    int hours;
    int minutes;
    int seconds;

    int secondsToMinutes = 60;
    int secondsToHours = 3600;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int seconds) {
        this.seconds = seconds%secondsToMinutes;
        this.hours = seconds/secondsToHours;
        this.minutes = seconds % secondsToHours/secondsToMinutes;
    }

    void setClock(int seconds){
        //получим количество часов из секунд
        this.hours = seconds/secondsToHours;
        this.minutes = seconds % secondsToHours/secondsToMinutes;
        this.seconds = seconds % secondsToMinutes;
        System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
    }

    void getHours(){
        System.out.println(this.hours);
    }
    void getMinutes(){
        System.out.println(this.minutes);
    }

    void getSeconds(){
        System.out.println(this.seconds);
    }

    void setHours(int newHours){
        this.hours = newHours;
    }

    void setMinutes(int newMinutes) {
        this.minutes = newMinutes;
    }

    void setSeconds(int newSeconds) {
        this.seconds = newSeconds;
    }

    void tick(){
        if(this.seconds == 59) {
            this.seconds = 0;
            this.minutes++;
            if(this.minutes == 59) {
                this.minutes = 0;
                this.hours++;
                if (this.hours == 23) {
                    this.hours = 0;
                }
            }
        }
        else
            this.seconds++;
        System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
    }

    void addClock(Clock clock){
        int hours = this.hours + clock.hours;
        int minutes = this.minutes + clock.minutes;
        int seconds = this.seconds + clock.seconds;

        if(seconds>59){
            seconds = seconds - 59;
            minutes++;
        }
        if (minutes>59){
            minutes = minutes - 59;
            hours++;
        }
        if(hours>23){
            hours = hours - 24;
        }
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    void tickDown (Clock clock){
        if(clock.seconds == 01) {
            clock.seconds = 59;
            clock.minutes--;
            if(clock.minutes == 01) {
                clock.minutes = 59;
                clock.hours--;
                if (clock.hours == 0) {
                    clock.hours = 23;
                }
            }
        }
        else
            clock.seconds--;
        System.out.println(clock.hours + ":" + clock.minutes + ":" + clock.seconds);
    }

     void subtractClock(Clock clock){

        int hours = this.hours - clock.hours;
        int minutes = this.minutes - clock.minutes;
        int seconds = this.seconds - clock.seconds;

        System.out.println("Разница во времени " + hours + " часов " + minutes + " минут " + seconds + " секунд");

    }

    public String toString(){
        return hours+":"+minutes+":"+seconds;
    }

}

