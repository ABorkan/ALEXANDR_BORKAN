package org.example.homework_nr_12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>(
                Arrays.asList(
                        new Employee("Alex", "Bor", 35, true, true),
                        new Employee("Anna", "Lip", 40, false, false),
                        new Employee("Grigorie", "Ciur", 23, false, false),
                        new Employee("Vitalie", "Briz", 38, true, true),
                        new Employee("Pavel", "Mis", 37, false, true),
                        new Employee("Alex", "Ber", 38, false, true),
                        new Employee("Natalia", "Rih", 30, false, false),
                        new Employee("Alex", "Kol", 35, true, true),
                        new Employee("Sergei", "Ceban", 28, false, false),
                        new Employee("Nicolai", "Pus", 23, true, false)
                )
        );

        System.out.println("5------------------------------");
        employeeList.stream()
                .filter(e -> e.getPayedByHour() && e.getCanConductInterview() && e.getAge() > 25)
                .distinct()
                .forEach(e-> System.out.println(e));

        System.out.println("6------------------------------");
        employeeList.stream()
                .filter(e -> !(e.getPayedByHour()) && e.getAge() > 30)
                .collect(Collectors.toList())
                .stream().map(e -> e.getName())
                .sorted()
                .forEach(e -> System.out.println(e));

        System.out.println("7------------------------------");
        Optional<Employee> employeeOptional = employeeList.stream()
                .filter(e -> e.getPayedByHour() && e.getCanConductInterview())
                .findFirst();

        if(employeeOptional.isPresent())
            System.out.println(employeeOptional.get());
        else
            System.out.println("Employee was not found!");

        System.out.println("8------------------------------");

        employeeList.stream()
                .sorted(Comparator.comparing(e -> e.getSurname()))
                .forEach(e -> System.out.println(e));
    }
}
