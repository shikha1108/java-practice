package example;

import java.util.ArrayList;
import java.util.List;

public class TeacherMain {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();

        Teacher mamta = new Teacher();
        mamta.name = "Mamta";
        mamta.salary = 90000;
        teachers.add(mamta);

        Teacher pankaj = new Teacher();
        pankaj.name = "Pankaj";
        pankaj.salary = 99000;
        teachers.add(pankaj);

        Teacher ani  = new Teacher();
        ani.name = "Ani";
        ani.salary = 91000;
        teachers.add(ani);

        Teacher anu = new Teacher();
        anu.name = "Anu";
        anu.salary = 80000;
        teachers.add(mamta);


        System.out.println(addSalary(teachers));

        for (Teacher teacher : teachers) {
            System.out.println("Name : " + teacher.name);
            System.out.println("Salary is : " + teacher.salary);
        }
        List<Teacher> result = increaseSalary(teachers);
        for (Teacher teacher : result) {
            System.out.println("Name : " + teacher.name );
            System.out.println("Salary is : " + teacher.salary);

        }

    }
    private static Integer addSalary(List<Teacher> teachers) {
        Integer sum = 0;
        for (Teacher teacher : teachers) {
            sum = sum + teacher.salary;
        }
        return sum;
    }
    private static List<Teacher> increaseSalary(List<Teacher> teachers) {
        List<Teacher> newteachers = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacher.salary = teacher.salary + 5000;
            newteachers.add(teacher);
        }
        return newteachers;
    }
    //total fees

}
