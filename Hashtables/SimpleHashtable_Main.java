package Hashtables;

import Employee.Employee;

public class SimpleHashtable_Main {
    public static void main(String[] args) {
        Employee atifMulla = new Employee("Atif", "Mulla",123);
        Employee parvezMulla = new Employee("Parvez","Mulla",456);
        Employee armanBhakshey = new Employee("Arman", "Bhakshey", 789);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put("atif",atifMulla);
        hashtable.put("parvez",parvezMulla);
        hashtable.put("arman",armanBhakshey);

        System.out.println("Retrieve key Parvez "+ hashtable.get("parvez"));
        hashtable.printHashtable();
    }
}
