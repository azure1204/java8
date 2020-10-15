package com.company.streams;

import com.company.database.Employee;
import com.company.database.EmployeeDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceExample {
    private static Optional<Employee> getHighestSalaryEmployee() {
        return EmployeeDatabase.getAllEmployee()
                .stream().reduce((sal1, sal2) -> sal1.getSalary() > sal2.getSalary() ? sal1 : sal2);
    }

    private static List<Employee> getFilteredEmployees() {
        return EmployeeDatabase.getAllEmployee()
                .stream()
                .filter((employee -> employee.getSalary() <= 10000))
                .collect(Collectors.toList());
    }

    private static Optional<Long> getMaxSalary() {
        return EmployeeDatabase.getAllEmployee()
                .stream()
                .map(Employee::getSalary)
                .reduce((sal1, sal2) -> sal1 + sal2);
    }

    public static void main(String[] args) {
        //Optional<Employee> highestSalaryEmployee = getHighestSalaryEmployee();
        //System.out.println(highestSalaryEmployee.get());
//        getFilteredEmployees().forEach(System.out::println);
        //System.out.println(getHighestSalary().get());
        Optional<Long> ret = getMaxSalary();
        if (ret.isPresent())
            System.out.println(getMaxSalary().get());
    }
}

