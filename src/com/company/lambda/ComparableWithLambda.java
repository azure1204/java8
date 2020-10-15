package com.company.lambda;

public class ComparableWithLambda {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 Started");
            }
        };
        new Thread(runnable).start();
        // With Java8

        Runnable runnable1 = () -> System.out.println("Lambda started");;
        new Thread(runnable1).start();
        new Thread(() -> {
            System.out.println("Lambda started2");
        }).start();
    }
}
