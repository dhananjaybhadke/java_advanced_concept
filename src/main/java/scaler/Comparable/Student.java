package main.java.scaler.Comparable;

public class Student implements Comparable<Student> {
    int marks;
    private String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {

//        way1
        if (this.marks>o.marks)
            return 1;
        else if (this.marks<o.marks)
            return -1;
        else return this.name.compareTo(o.name);

//        way2
//        return Integer.compare(this.marks, o.marks);

//        way3
//        return  this.marks - o.marks;
    }
}
