package oop;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Anu";
        student.rollno = 1001;
        student.number =97;

        Student student1 = new Student();
        student1.name = "Anu";
        student1.rollno = 1002;
        student1.number =82;

        Student student2 = new Student();
        student2.name = "Anu";
        student2.rollno = 1003;
        student2.number =60;

        Student student3 = new Student();
        student3.name = "Anu";
        student3.rollno = 1004;
        student3.number =70;
            List<Student> Students = new ArrayList<>();
            Students.add(student);
            Students.add(student1);
            Students.add(student2);
            Students.add(student3);
        for (Student student4 : Students) {
            System.out.println(student4.rollno);
        }

       // System.out.println(topper(Students,33));


    }
    public static List<Student> topper(List<Student>students,Integer key) {
        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if(student.number>key) {
                studentList.add(student);
            }
        }
        return studentList;
    }

}
