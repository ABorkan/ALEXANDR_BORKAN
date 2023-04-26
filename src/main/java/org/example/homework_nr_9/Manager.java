package org.example.homework_nr_9;

public class Manager extends Employee implements Trainingable, Interviewable {

    private String subdivision;

    public Manager(String name, String surname, Integer age, String subdivision) {
        super(name, surname, age);
        this.subdivision = subdivision;
    }

    @Override
    public void interiew() {
        System.out.println("Менеджер может проводить интервью");
    }

    @Override
    public void training() {
        System.out.println("Менеджер может проводить обучение");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Name='" + getName() + '\'' +
                ", Surname='" + getSurname() + '\'' +
                ", Age='" + getAge() + '\'' +
                "subdivision='" + subdivision + '\'' +
                '}';
    }
}
