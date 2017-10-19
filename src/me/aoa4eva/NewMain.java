package me.aoa4eva;

import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args){
        Student newStudent = new Student();
        ArrayList<Person> myAddressBook = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String choice;
        newStudent.setFirstName("Abena");
        newStudent.setLastName("Asamoah");
        newStudent.setEmail("abena@asamoah.com");

        myAddressBook.add(newStudent);
        System.out.println("(E)ter new student details");
        System.out.println("(A)dd new teacher details");
        System.out.println(" A(d)d course to student");
        System.out.println(" Add (c)ourse to teacher");
        choice = keyboard.nextLine();

    }
}
