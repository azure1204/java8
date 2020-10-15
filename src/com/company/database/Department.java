package com.company.database;

public class Department {

    private  long departmentid;
    private  String departmentname;

    public Department(long departmentid, String departmentname) {
        this.departmentid = departmentid;
        this.departmentname = departmentname;
    }

    public long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(long departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentid=" + departmentid +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }
}
