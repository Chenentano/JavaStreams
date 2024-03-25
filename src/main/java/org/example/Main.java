package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1, 3, 4, 11, 6, 7, 8, 9, 10);

        List <Integer> collectNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted()
                .collect(Collectors.toList());

        //System.out.println("Even numbers: " + evenNumbers);
        //System.out.println("Doubled numbers: " + doubleEvenNumbers);
        //System.out.println("List sum: " + sumNumbers);
        System.out.println(collectNumbers);



    }
}