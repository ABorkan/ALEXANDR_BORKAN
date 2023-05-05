package org.example.homework_nr_11;

import java.util.function.Function;

public enum abracadabra {
    VOWEL(e -> {
        Integer count = 0;
        String vowel = "aeiouy";
        e.toLowerCase();
        for(char c : e.toCharArray()){
            if(vowel.indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }),
    CONSONANTS(e -> {
        Integer count = 0;
        String vowel = "aeiouy";
        e = e.toLowerCase();
        for(char c : e.toCharArray()){
            if(vowel.indexOf(c) == -1){
                count++;
            }
        }

        return count;
    }),

    NUMBERS(e -> {
        Integer count = 0;
        for(char c : e.toCharArray()){
            if(Character.isDigit(c)){
                count++;
            }
        }
        return count;
    });

    public final Function<String, Integer> operation;

    abracadabra(Function<String, Integer> operation) {
        this.operation = operation;
    }
}
