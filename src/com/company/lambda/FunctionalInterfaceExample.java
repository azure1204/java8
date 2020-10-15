package com.company.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionalInterfaceExample {
    private  static Function<List<Integer>, Map<Integer,Integer>> squareint =(numbers ->{
        Map<Integer,Integer> squareMap  = new HashMap<>();
        numbers.forEach(number ->{
            if(Excercise.evenpredicate.test(number)) {
                squareMap.put(number, number * number);
            }
        });
        return squareMap;
    });

    public static void main(String[] args) {
        System.out.println(squareint.apply(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
    }
}
