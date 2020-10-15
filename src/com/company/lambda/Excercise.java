package com.company.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import  java.util.List;

public class Excercise {
    public   static Predicate<Integer> evenpredicate = (number) -> number % 2 == 0;
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        getEvenList(numbers).forEach(number -> System.out.println(number));

    }
    private static List<Integer>  getEvenList(List<Integer> numbers){
        List <Integer> even_nos = new ArrayList<Integer>();
        numbers.forEach(number -> {
            if(evenpredicate.test(number)){
                even_nos.add(number);
            }
        } );
        return  even_nos;
    }
}
