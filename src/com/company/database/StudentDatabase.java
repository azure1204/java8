package com.company.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    public static List<Student> getAllStudents(){
        List <Student> students  = new ArrayList<>();
        students.add(new Student(1,"Phani", Arrays.asList("Reading","Swimming")));
        students.add(new Student(2,"Atul", Arrays.asList("Playing","Cooking")));
        students.add(new Student(2,"Vinayak", Arrays.asList("Roaming","Studying")));

        return  students;

    }
}
