package com.company.lambda;

import com.sun.deploy.security.BlacklistedCerts;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    private  Consumer<String> getConsumer(String name){
        Consumer<String> consumer = (n1) -> System.out.println(n1.toLowerCase());

        return  consumer;
    }

    public static void main(String[] args) {
        List <String> fruits = Arrays.asList("Apple","Orange","Mango");

        BiConsumer <Integer,Integer> add = (num1,num2) -> {

        };
        BiConsumer <Integer,Integer> substraction = (num1,num2) -> {
            System.out.println(num1 - num2);
        };
        BiConsumer <Integer,Integer> mult = (num1,num2) -> {
            System.out.println(num1 * num2);
        };
        BiConsumer <Integer,Integer> div = (num1,num2) -> {
            System.out.println(num1 / num2);
        };

        add.andThen(substraction).andThen(mult).andThen(div).accept(10,5);

        //  fruits.forEach(new ConsumerExample().getConsumer());
        /*<String> consumer = (fruit) -> System.out.println(fruit.toUpperCase());


        List <String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        //System.out.println(consumer);

        racpc5.pune@sbi.co.in
        fruits.forEach(consumer);*/


    }
}
