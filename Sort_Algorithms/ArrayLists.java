package com.company.Sort_Algorithms;
import com.company.LinkedLists.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Atif", "Mulla", 123));
        employees.add(new Employee("Arman", "Bhakshey",456));
        employees.add(new Employee("Abhishek","Singh",789));

        employees.forEach(Employee -> System.out.println(Employee));


        Employee[] employeeArray = employees.toArray(new Employee[employees.size()]);
        for(Employee e: employeeArray){
            System.out.println(e);
        }

        System.out.println(employees.contains(new Employee("Arman","Bhakshey", 456)));

        System.out.println(employees.indexOf(new Employee("Abhishek", "Singh",789)));
    }

}
