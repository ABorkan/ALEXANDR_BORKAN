package org.example.homework_nr_9;

public class Programmer extends Employee implements Trainingable {

    private String programmingLanguage;

    public Programmer(String name, String surname, Integer age, String programmingLanguage) {
        super(name, surname, age);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void training() {
        System.out.println("Программист может проводить обучение");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "Name='" + getName() + '\'' +
                ", Surname='" + getSurname() + '\'' +
                ", Age='" + getAge() + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
