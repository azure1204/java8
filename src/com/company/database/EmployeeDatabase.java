package com.company.database;

import sun.security.x509.IssuerAlternativeNameExtension;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeDatabase {
    private static List<Employee> employees = new ArrayList<Employee>();

    static{
        Set<Department> departmentSet = new HashSet<Department>();
        departmentSet.add(new Department(1,"PLM"));
        departmentSet.add(new Department(2,"Design"));
        departmentSet.add(new Department(3,"Finance"));

        employees.add(new Employee(1,"Atul", 20000,departmentSet));
        employees.add(new Employee(2,"Trupti",30000,departmentSet));
        employees.add(new Employee(3,"Sachin",5000,departmentSet));

    }
    public  static  List<Employee> getAllEmployee(){
        return employees;
    }
}
