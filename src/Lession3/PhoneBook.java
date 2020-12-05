package Lession3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<Integer>> phoneBook;
    
    public PhoneBook(){
        phoneBook= new HashMap<>();
    }
    public void add(String name, int number){
        if (this.phoneBook.containsKey(name)){
            this.phoneBook.get(name).add(Integer.valueOf(number));
        }else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.valueOf(number));
            phoneBook.put(name, arrayList);
        }
    }

    public StringBuilder get(String name){
        if (phoneBook.containsKey(name)) {
            StringBuilder sb = new StringBuilder();
            sb.append(name + "\n" + phoneBook.get(name).toString());
            return sb;
        }
        return new StringBuilder();
    }

}
