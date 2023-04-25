package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee programmer1 = new Programmer("Alex", "Stud", 35, "PHP");
        Employee manager1 = new Manager("Nicolai", "Bejenari", 30, "Sales");

        ((Programmer) programmer1).training();
        ((Manager) manager1).training();
        ((Manager) manager1).interiew();

        System.out.println("-------------------------------------");

        List<Employee> newList = new ArrayList<>();
        newList.add(programmer1);
        newList.add(manager1);

        MeetingRoom meet = new MeetingRoom(newList);

        for (Employee element :
                newList) {
            System.out.print(element.toString()+ " ");
            meet.AttenTraining();
        }

        System.out.println("-------------------------------------");

        Employee[] array = new Employee[]{programmer1, manager1};

        for (Employee element :
                array) {
            if (element instanceof Programmer) {
                ((Programmer) element).training();
            }
            if (element instanceof Manager) {
                ((Manager) element).training();
                ((Manager) element).interiew();
            }
        }


    }
}
