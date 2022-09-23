package Hashtables;

import Employee.Employee;

public class LinearProbing_Hashtable_Main {

    public static void main(String[] args) {

        Employee atifMulla = new Employee("Atif", "Mulla",123);
        Employee parvezMulla = new Employee("Parvez","Mulla",456);
        Employee armanBhakshey = new Employee("Arman", "Bhakshey", 789);
        Employee pranavVernekar = new Employee("Pranav", "Vernekar",7838);
        Employee ilyasQhureshi = new Employee("Ilyas","Qhureshi",435);

        LinearProbing_Hashtable hashtable = new LinearProbing_Hashtable();
        hashtable.put("atif",atifMulla);
        hashtable.put("parvez",parvezMulla);
        hashtable.put("arman",armanBhakshey);
        hashtable.put("Pranav",pranavVernekar);
        hashtable.put("Ilyas",ilyasQhureshi);

//        System.out.println(hashtable.get("Ilyas"));
        hashtable.printHashtable();

    }
}
