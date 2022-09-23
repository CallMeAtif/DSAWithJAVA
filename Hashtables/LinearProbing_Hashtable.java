package Hashtables;

import Employee.Employee;

// using linear probing for hashtable
// updated get and put function to work with linear probing
// this hashtable implementation is essentially gonna wrap if we hit the end of the array

public class LinearProbing_Hashtable {
    private StoredEmployee [] hashtable;

    LinearProbing_Hashtable(){
        hashtable = new StoredEmployee[10];
    }


    // put func() to input key and employee
    public void put(String key, Employee employee){
        int hashedKey = hashkey(key);
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            }
            else
                hashedKey++;

            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }

        }
        if(hashtable[hashedKey] != null){
            System.out.println("Sorry!, this is already occupied by "+ hashedKey);
        }
        else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1)
            return null;
        return hashtable[hashedKey].employee;
    }


    // finding the key's value that has been entered string key and employee
    private int findKey(String key){
        int hashedKey = hashkey(key);
        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length - 1){
            hashedKey = 0;
        }
        else
            hashedKey++;

        while(hashedKey != stopIndex && hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            hashedKey = (hashedKey + 1) % hashtable.length;
        }


        if(hashedKey == stopIndex)
            return -1;
        else
            return  hashedKey;
    }

    // occupied func() to get if the index is null or not
    public boolean occupied(int index){
        return hashtable[index] != null;
    }


    //to hash the key into an integer
    public int hashkey(String key){
        return key.length() % hashtable.length;
    }



    // printing the hashtable
    public void printHashtable(){
        for(int i = 0; i < hashtable.length;i++){
            if(hashtable[i] == null){
                System.out.println("empty");
            }
            else
                System.out.println("Position "+ i +" : " + hashtable[i].employee);
        }
    }




    private class StoredEmployee{

        private String key;
        private Employee employee;

        public StoredEmployee(String key, Employee employee) {
            this.key = key;
            this.employee = employee;
        }
    }
}
