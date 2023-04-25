package org.example.homework_nr_9;

import java.util.List;

public class MeetingRoom {

    List<Employee> meet;

    public MeetingRoom(List<Employee> meet) {
        this.meet = meet;
    }

    void AttenTraining(){
        System.out.println("can provide training");
    }

}
