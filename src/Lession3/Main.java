package Lession3;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String[] arr;
        arr = new String[]{"name1", "name2", "name1", "name4", "name5", "name6", "name7", "name8", "name9", "name1"};
        getUnique(arr);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Misha", 134546646);
        phoneBook.add("Misha1", 134546646);
        phoneBook.add("Misha2", 134546646);
        phoneBook.add("Misha", 134546646);
        System.out.println(phoneBook.get("Misha"));
    }
    public static void getUnique(String[] arr) {
        HashSet<String> unique = new HashSet<>(Arrays.asList(arr));
        Iterator<String> iterator = unique.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println( str + " = " + ((int) Arrays.stream(arr).filter(Predicate.isEqual(str)).count()));
        }
    }
}
