package com.company.streams;

import com.company.database.Employee;
import com.company.database.EmployeeDatabase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class EmployeeClient {
    public  static List<Employee> getEmployeeSortedBySalary(){
        return EmployeeDatabase.getAllEmployee()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(toList());
    }

    public  static List<Employee> getEmployeeSortedByName(){
        return EmployeeDatabase.getAllEmployee()
                .stream()
                .sorted(Comparator.comparing(Employee::getEname))
                .collect(toList());
    }

    public static List<String> getEmployeeNamesSortedUppercase(){
        return EmployeeDatabase.getAllEmployee()
                .stream()
                .map(Employee::getEname)
                .distinct()
                .map(String::toUpperCase)
                .sorted()
                .collect(toList());


    }

    public  static List<Integer> getuniqueSortedNumbers(List<Integer> numbers){
        return numbers.stream()
                .distinct()
                .sorted()
                .collect(toList());
    }
    public static void main(String[] args) {
      getEmployeeNamesSortedUppercase().forEach(System.out::println);
        //  getuniqueSortedNumbers(Arrays.asList(10,20,5,10,20,30)).forEach(System.out::println);
       // System.out.println(getEmployeeSortedByName());
      //  System.out.println("By Salary");
        //getEmployeeSortedBySalary().forEach(System.out::println);
        //System.out.println("By Name");
        //getEmployeeSortedByName().forEach(System.out::println);
    }
}
