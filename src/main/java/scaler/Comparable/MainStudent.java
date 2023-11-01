package main.java.scaler.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(23, "Ram"));
        students.add(new Student(35, "Shyam"));
        students.add(new Student(83, "Aman"));
        students.add(new Student(13, "Rohit"));
        students.add(new Student(23, "Anuj"));

        // To sort objs we cant directly do Collections.sort it will give the error to implement the comparable
        Collections.sort(students);
        students.forEach(System.out::println);




    }
}
