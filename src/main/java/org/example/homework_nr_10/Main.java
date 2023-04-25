package org.example.homework_nr_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();
        toDoList.add("Do homework");
        toDoList.add("Work");
        toDoList.add("Have lunch");
        toDoList.add("Work");
        toDoList.add("Go home");
        toDoList.add("Another");
        toDoList.add("all");

        System.out.println(toDoList);

        HashSet<String> removeDuplicate = new HashSet<>(toDoList);
        System.out.println(removeDuplicate);


        Map<String, String> EngRom = new HashMap<>();
        EngRom.put("Home", "Acasa");
        EngRom.put("Translate", "Traduce");
        EngRom.put("Move", "Miscare");
        EngRom.put("Game", "joc");
        EngRom.put("Bedroom", "Toaleta");
        EngRom.put("Man", "Om");
        EngRom.put("Children", "Copii");
        EngRom.put("Grandpa", "Bunicul");
        EngRom.put("Eye", "Ochi");
        EngRom.put("Work", "Munca");

        for (Map.Entry<String, String> element : EngRom.entrySet()){
            System.out.println("Eng: " + element.getKey() + " - " + "Ro: " + element.getValue());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(54);
        stack.push(35);
        stack.push(45);
        stack.push(4);
        System.out.println("--------------------------------");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("------------------------");
        System.out.println(stack.peek());
        System.out.println(stack);


        toDoList.removeIf(e -> e.startsWith("A"));

        System.out.println(toDoList);


        toDoList.replaceAll(e -> {
            if(e.contains("al"))
                return "replaced String";
            return e;
        });

        System.out.println(toDoList);
    }
}
