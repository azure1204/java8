package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static Predicate<Integer> divideby2 = (number) -> number % 2== 0;
    public static Predicate<Integer> divideby5 = (number) -> number % 5== 0;

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(0,50).max().getAsInt());
  }
}
