package com.company.database;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    private  long  eid;
    private String ename;
    private long salary;
    private Set<Department> departments =new HashSet<Department>();

    public Employee(long eid, String ename, long salary ,Set<Department> departments) {
        this.eid = eid;
        this.ename = ename;
        this.departments = departments;
        this.salary = salary;
    }

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", departments=" + departments +
                '}';
    }
}
