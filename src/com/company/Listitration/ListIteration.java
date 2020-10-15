package com.company.Listitration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListIteration {
    private static final  Predicate<Float> checkAvg = (avg) -> avg >= 60f;
    private static final Function<List<Students>, List<Students>> filterStudents = (students -> {
        List<Students> filteredStudents = new ArrayList<Students>();
        students.forEach(student -> {
            if (checkAvg.test(student.getAvg())) {
                filteredStudents.add(student);
            }
        });
        return filteredStudents;
    });

    public static void main(String[] args) {
        List<Students> students = new ArrayList<Students>();
        Students amit = new Students(1, "Amit", Arrays.asList("Playing", "Reading"), 55.2f);
        Students trupti = new Students(2, "Trupti", Arrays.asList("Cooking", "Dancing"), 70.2f);
        Students atul = new Students(3, "Atul", Arrays.asList("Coding", "Dancing"), 85.2f);
        Students moin = new Students(4, "Moin", Arrays.asList("Coding", "Teaching"), 55.2f);
        students.add(amit);
        students.add(trupti);
        students.add(atul);
        students.add(moin);
        filterStudents.apply(students).forEach(System.out::println);
    }
}

class Students {

    private int studentid;
    private String studentName;
    private List<String> hobbies;
    private float avg;

    public Students(int studentid, String studentName, List<String> hobbies, float avg) {
        this.studentid = studentid;
        this.studentName = studentName;
        this.hobbies = hobbies;
        this.avg = avg;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentid=" + studentid +
                ", studentName='" + studentName + '\'' +
                ", hobbies=" + hobbies +
                ", avg=" + avg +
                '}';
    }
}

