package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);

        }

        // Java 8 List stream example
        List<String> names = Arrays.asList("Alice Smith", "Bob Brown", "Charlie Adams", "Anna White");
        names.stream()
            .filter(name -> name.startsWith("A"))
            .forEach(System.out::println);



        // Example: Using flatMap to split names into words and print each word
        names.stream()
            .flatMap(name -> Arrays.stream(name.split(" ")))
            .forEach(System.out::println);
    }
}
