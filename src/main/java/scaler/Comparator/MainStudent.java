package main.java.scaler.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(23, "Ram"));
        students.add(new Student(35, "Shyam"));
        students.add(new Student(83, "Anuj"));
        students.add(new Student(13, "Rohit"));
        students.add(new Student(23, "Anuj"));

        // To sort objs we cant directly do Collections.sort it will give the error to implement the comparable
//        Collections.sort(students,new ComparatorStudent());

//        Anonymous class
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.getName().equals(o2.getName()) ){
//                    return  o1.getMarks() - o2.getMarks();
//                } else {
//                    return o1.getName().compareTo(o2.getName());
//                }
//            }
//        });

//        derived lambda function from anonymous class
//        Collections.sort(students, (Student o1, Student o2) ->{
//            if(o1.getName().equals(o2.getName()) ){
//                return  o1.getMarks() - o2.getMarks();
//            } else {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        sorting with name first then marks(if name equal then sort with marks)
//        Collections.sort(students, (o1, o2) ->{
//            if(o1.getName().equals(o2.getName()) ){
//                return  o1.getMarks() - o2.getMarks();
//            } else {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        Optimize way of Sorting with name only
//        Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName()));

//        Optimize way of sorting with name first then marks(if name equal then sort with marks)
        Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
        students.forEach(System.out::println);




    }
}

