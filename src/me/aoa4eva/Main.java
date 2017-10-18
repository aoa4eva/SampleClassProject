package me.aoa4eva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        Person  newPerson = new Person();

        System.out.print("Enter person's first name:");
        newPerson.setFirstName(keyboard.nextLine());
        System.out.print("You entered "+newPerson.getFirstName()+" as the person's first name");

    }
}
