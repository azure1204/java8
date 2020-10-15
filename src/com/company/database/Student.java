package com.company.database;

import java.util.List;

public class Student {
    private int student_id;
    private String studentName;
    private List<String> activities;

    public Student(int student_id, String studentName, List<String> activities) {
        this.student_id = student_id;
        this.studentName = studentName;
        this.activities = activities;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", studentName='" + studentName + '\'' +
                ", activities=" + activities +
                '}';
    }

}
