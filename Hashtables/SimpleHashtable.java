package Hashtables;

import Employee.Employee;

public class SimpleHashtable {
    private Employee [] hashtable;

    SimpleHashtable(){
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashkey(key);
        if(hashtable[hashedKey] != null){
            System.out.println("Sorry!, this is already occupied by "+ hashedKey);
        }
        else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashkey(key);
        return hashtable[hashedKey];
    }

    public int hashkey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for(int i = 0; i < hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }
}
