package com.mouli.collections;

import java.util.ArrayList;
import java.util.Collection;

public class StudentCollection {

    public static void main(String[] args) {
    	System.out.println("Main method started");
       
        Collection<String> students = new ArrayList<>();
        students.add("Mouli");
        students.add("Surya");
        students.add("Rahul");
        students.add("Priya");
        students.add("Anjali");
        students.add("Kiran");
        students.add("Arjun");
        students.add("Sneha");
        students.add("Vijay");
        students.add("Divya");

        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }

        String searchName = "Rahul";

        if (students.contains(searchName)) {
            System.out.println("\n" + searchName + " is present in the collection.");
        } else {
            System.out.println("\n" + searchName + " is not present in the collection.");
        }

        String removeName = "Priya";

        if (students.remove(removeName)) {
            System.out.println(removeName + " removed successfully.");
        } else {
            System.out.println(removeName + " not found.");
        }

        System.out.println("\nSize of collection: " + students.size());

        System.out.println("Is collection empty? " + students.isEmpty());

        students.clear();

        System.out.println("\nCollection cleared successfully.");
        System.out.println("Is collection empty after clear()? " + students.isEmpty());
    }
}
