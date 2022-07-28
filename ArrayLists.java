package com.company;
import javax.swing.plaf.multi.MultiLabelUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        List<Employee_ArrayList> employees = new ArrayList<>();

        employees.add(new Employee_ArrayList("Atif", "Mulla", 123));
        employees.add(new Employee_ArrayList("Arman", "Bhakshey",456));
        employees.add(new Employee_ArrayList("Abhishek","Singh",789));

        employees.forEach(employee_arrayList -> System.out.println(employee_arrayList));
    }

}
