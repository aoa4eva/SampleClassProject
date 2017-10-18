package me.aoa4eva;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//
        //Prepare to accept user input
        Scanner keyboard = new Scanner(System.in);

        //Create a new Person object
        Person  newPerson = new Person();

        System.out.print("Enter person's first name:");
        //Get details from the user
        newPerson.setFirstName(keyboard.nextLine());


        //Output user's input
        System.out.print("You entered "+newPerson.getFirstName()+" as the person's first name");


        ArrayList <Person> thePersonList = new ArrayList<Person>();
        thePersonList.add(newPerson);

//        System.out.println("This is the name entered for the first person:"+thePersonList.get(0).getFirstName());


        for(Person eachPerson: thePersonList )
        {

            eachPerson.getFirstName();
        }


    }

    public static void testArrayLists()
    {
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("First String");
        arrayList.add("Second String");
        arrayList.add("Third String");
        arrayList.add("Fourth String");
        arrayList.add("Fifth String");
        System.out.println("This arraylist has "+arrayList.size()+" items");
        for(int counter=0; counter<arrayList.size(); counter++)
        {
            System.out.println(arrayList.get(counter));
        }

        System.out.println(" ");

        for(String eachItem: arrayList )
        {

            System.out.println(eachItem);
        }


    }
}















//
//        for(int counter=0; counter<thePersonList.size(); counter++)
//        {
//            System.out.println(thePersonList.get(counter));
//        }
