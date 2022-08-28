package oop;

import algo.Palindrome;

import java.util.ArrayList;
import java.util.List;

public class OopMain {
    public static void main(String[] args) {
       Person shikha = new Person();
       shikha.name ="anu";
       shikha.printName();
       Person.printHelloWorld();

       Employee employee = new Employee();
       employee.name = "Shikha";
       employee.role = "Software engineer";
       employee.salary = 50000;

       Employee employee1 = new Employee();
       employee1.name = "Mamta";
       employee1.role = "Software engineer";
       employee1.salary = 90000;

       Employee employee2 =new Employee();
       employee2.name = "Pankaj";
       employee2.role = "Software engineer";
       employee2.salary = 99000;

       Employee employee3 = new Employee();
       employee3.name = "Lucky";
       employee3.role = "Software engineer";
       employee3.salary = 93000;
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(highestSalary(employees).name);
        System.out.println(highestSalary(employees).role);
        List<Employee> result =salaryMoreThan(employees,90000);
        for (Employee employee4 : result) {
            System.out.println(employee4.salary);
            System.out.println(employee4.name);

        }


    }
    public static Employee highestSalary(List<Employee> employees){
        Employee salary = employees.get(0);
        for (Employee employee : employees) {
            if(employee.salary> salary.salary){
                salary = employee;
            }
        }
        return salary;
    }
    public static  List<Employee> salaryMoreThan(List<Employee> employees,Integer key) {
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.salary>key){
                employeeList.add(employee);
            }
        }
     return employeeList;
    }
}
