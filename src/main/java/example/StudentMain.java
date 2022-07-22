package example;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student shikha = new Student();
        shikha.name = "Shikha";
        shikha.numbers = 90;
        students.add(shikha);

        Student pankaj = new Student();
        pankaj.name = "Pankaj";
        pankaj.numbers = 99;
        students.add(pankaj);

        Student ani = new Student();
        ani.name = "Ani";
        ani.numbers = 93;
        students.add(ani);

        Student anu = new Student();
        anu.name = "Anu";
        anu.numbers = 70;
        students.add(anu);

        Student lucky = new Student();
        lucky.name = "Lucky";
        lucky.numbers = 85;
        students.add(lucky);

        Student snowwhite = new Student();
        snowwhite.name = "Snowwhite";
        snowwhite.numbers = 20;
        students.add(snowwhite);

        Student cinderella = new Student();
        cinderella.name = "Cinderella";
        cinderella.numbers = 05;
        students.add(cinderella);

        Student jasmine = new Student();
        jasmine.name = "Jasmine";
        jasmine.numbers = 25;
        students.add(jasmine);

        Student ariel = new Student();
        ariel.name = "Ariel";
        ariel.numbers = 15;
        students.add(ariel);


        Student result = topper(students);
        System.out.println(result.name);


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
}
