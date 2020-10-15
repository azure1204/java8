package com.company.streams;

import com.company.database.Employee;
import com.company.database.Student;
import com.company.database.StudentDatabase;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentClint {

    private  static Predicate<String> checkifActivityStartsWithS = (str) -> str.startsWith("S");
    private static Function<List<Student>, List<String>> function = (studentList) -> {
        List<String> activities = new ArrayList<>();
        studentList.forEach(student -> {
            student.getActivities().forEach(activity -> {
                if(checkifActivityStartsWithS.test(activity)) {
                    activities.add(activity);
                }
            });
        });
        return activities;
    };
    private static Function<List<Student>, Map<Integer, List<String>>> getactiviyByStudent = (studentList -> {
        Map<Integer, List<String>> studentActivityMap = new HashMap<>();
        studentList.forEach(student -> {
            studentActivityMap.put(student.getStudent_id(), student.getActivities());
        });
        return studentActivityMap;
    });
    private static BiPredicate<Employee, Employee> checkifTwoEmployeeHasSameSalary =
            (employee, employee2) -> employee.getSalary() == employee2.getSalary();

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Lavan", 20000, new HashSet<>());
        Employee e2 = new Employee(2, "Rajan", 20000, new HashSet<>());
        System.out.println(checkifTwoEmployeeHasSameSalary.test(e1, e2) ? "great" : "not great");
    }


}
