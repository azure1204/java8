package com.company.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import  java.util.List;

public class PredicateExample {


    public static void main(String[] args) {
        Predicate<Integer> predicate1 = (num1) -> num1 % 2 == 0 ;
        Predicate<Integer> predicate2 = (num2) -> num2 % 5 == 0 ;

        System.out.println(predicate1.or(predicate2).negate().test(12));

    }
}
