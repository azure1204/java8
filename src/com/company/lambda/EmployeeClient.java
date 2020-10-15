package com.company.lambda;

import com.company.database.Department;
import com.company.database.Employee;
import com.company.database.EmployeeDatabase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeClient {
    private  static Predicate<Employee> predicate = (employee -> employee.getSalary()>25000);
    private  static  Predicate<Employee> deptPredicate = (employee -> employee.getDepartments().size() == 3);
    private  static BiPredicate<Employee, Department> biPredicate = (employee,department) -> employee.getSalary() >25000 && department.getDepartmentname().equalsIgnoreCase("PLM");
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDatabase.getAllEmployee();
        employeeList.forEach((employee -> {
            employee.getDepartments().forEach(department -> {
                if(biPredicate.test(employee,department)){
                    System.out.println(employee +":" +department);
                }
            });

            /*if(predicate.and(deptPredicate).test(employee)){
                System.out.println(employee.getEname() );
            }else{
                System.out.println("condition didn't match");
            }*/
        }));
    }
}
