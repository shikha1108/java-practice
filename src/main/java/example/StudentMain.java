package example;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student shikha = new Student();
        shikha.name = "Shikha";
        shikha.numbers = 90;
        shikha.rollno = 1;
        students.add(shikha);

        Student pankaj = new Student();
        pankaj.name = "Pankaj";
        pankaj.numbers = 99;
        pankaj.rollno = 5;
        students.add(pankaj);

        Student ani = new Student();
        ani.name = "Ani";
        ani.numbers = 93;
        ani.rollno = 9;
        students.add(ani);

        Student anu = new Student();
        anu.name = "Shikha";
        anu.numbers = 70;
        anu.rollno = 7;

        students.add(anu);




        Student result = topper(students);
        //System.out.println(result.name);
        System.out.println(searchRollno(students, 8));
        System.out.println(searchName(students, "bruno"));
        System.out.println(searchName(students, "pankaj"));
        System.out.println(countName(students, "pankaj"));


    }

    private static Student topper(List<Student> st) {
        Student topper = st.get(0);
        for (Student students : st) {
            if (students.numbers > topper.numbers) {
                topper = students;
            }
        }
        return topper;
    }
    private static List<Student> getFailed(List<Student> st, int minMarks) {
        List<Student> failed = new ArrayList<>();
        for (Student students : st) {
            if(students.numbers < minMarks) {
                failed.add(students);
            }
        }
        return failed;
    }
    private static Boolean searchRollno(List<Student> students,Integer roll){
        Boolean result = false;
        for (Student student : students) {
            if (student.rollno == roll ){
                result = true;

            }
        }
        return result;
    }
    private static Boolean searchName(List<Student> students, String name){
        Boolean result = false;
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)){
                result = true;
                break;
            }
        }
        return result;

    }
    private static Integer countName(List<Student> students,String name){
        Integer result = 0;
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)){
                result = result + 1;
            }
        }
        return result;
    }
}
