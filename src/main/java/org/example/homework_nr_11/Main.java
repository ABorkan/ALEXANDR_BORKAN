package org.example.homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> newStringList = new ArrayList<>(
                Arrays.asList(
                        "Hello", "World", "Cat", "Dog", "Natasha has 4 cats", "Tekwill", "Anna"
                )
        );

        List<Integer> newIntegerList = new ArrayList<>(
                Arrays.asList(
                        23, 45, 67, 90, 93
                )
        );

        System.out.println("---------Вывод кол-во гласных букв в строке через стримы--------------");
        newStringList.forEach(e -> System.out.println(e + " - " + e.toLowerCase()
                .chars()
                .mapToObj(o -> (char) o)
                .filter(o -> "aeiouy".contains(String.valueOf(o)))
                .count())
        );

        System.out.println("-----------------Вывод кол-вщ гласных букв в строке-------------------");
        newStringList.forEach(e -> countVowels(e, abracadabra.VOWEL.operation));
        System.out.println("------------------Вывод кол-во согласных букв в строке------------------");
        newStringList.forEach(e -> countVowels(e, abracadabra.CONSONANTS.operation));
        System.out.println("------------------Вывод кол-во цифр в строке------------------");
        newStringList.forEach(e -> countVowels(e, abracadabra.NUMBERS.operation));

        Function<String, Character> evenOdd = e -> {
            Integer count = 0;
            for(int i = 0; i < e.length(); i++){
                count++;
            }
            if(count%2==0){
                return null;
            }
               return e.charAt(0);
        };
        System.out.println("------------------Вывод первого символа строки если кол-во символов не четное иначе null------------------");
        newStringList.forEach(e -> System.out.println(evenOdd.apply(e)));

        Predicate<String> palindrome = e -> {
            e = e.toLowerCase();
            StringBuffer buffer = new StringBuffer(e);
            buffer.reverse();
            String data = buffer.toString();
            if(e.equals(data)){
                return true;
            }else{
              return false;
            }
        };

        System.out.println("--------------Если палиндроме то true иначе false----------------------");
        newStringList.forEach(e -> System.out.println(palindrome.test(e)));

        System.out.println("--------------Если простое то true иначе false----------------------");
        Predicate<Integer> easyNumbers = e ->{
            for(int i=2; i!=e; i++){
                if(e%i==0)
                    return false;
                return true;
            }
            return false;
        };

        newIntegerList.forEach(e -> System.out.println(e + " " +easyNumbers.test(e)));

    }

    public static void countVowels(String strings, Function<String, Integer> inputFunction) {
        System.out.println(strings + " - " + inputFunction.apply(strings));
    }
}