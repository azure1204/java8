package com.company.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class StudentClient {
    static  int val =6;
    public static void main(String[] args) {

        Consumer<Integer> consumer = (number) -> {
            val++;
        };
    }
}
