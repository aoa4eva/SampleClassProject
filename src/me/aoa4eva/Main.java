package me.aoa4eva;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Prepare to accept user input
        Scanner keyboard = new Scanner(System.in);
        ArrayList <Person> thePersonList = new ArrayList<Person>();
        String yesOrNo="";

//        Doctor drPerson = new Doctor();
//        drPerson.getMainHospital();
//
//        Person drPerson2 = new Doctor();
//        drPerson2.getMainHospital();
//
//        drPerson.setFirstName("First Doctor Name");
//        drPerson.setLastName("Last Doctor Name");
//        drPerson.setEmail("email@doctorsemail.com");
//        drPerson.setPhoneNumber("555-123-DRDR");
//        drPerson.setAddress("123 Dr Lane");
//
//        drPerson2.setFirstName("Second Doctor Name");
//        drPerson2.setLastName("LastSecond Doctor Name");
//        drPerson2.setEmail("email@doctorsemail.com");
//        drPerson2.setPhoneNumber("555-124-DRDR");
//        drPerson2.setAddress("124 Dr Lane");

        do{
            Person  newPerson = new Person();
            System.out.print("Enter person's first name:");
            newPerson.setFirstName(keyboard.nextLine());
            thePersonList.add(newPerson);

            do {

                    System.out.print("Do you want to continue?(Y/N)");
                    yesOrNo=keyboard.nextLine();
                    if(!yesOrNo.equalsIgnoreCase("y")&& !yesOrNo.equalsIgnoreCase("n"))
                    {
                        System.out.println("Invalid option. Please enter 'Y' or 'N' ");
                    }
            }while(!yesOrNo.equalsIgnoreCase("y")&&!yesOrNo.equalsIgnoreCase("n"));

        }while(yesOrNo.equalsIgnoreCase("y")||!yesOrNo.equalsIgnoreCase("n"));

//        thePersonList.add(drPerson);
//        thePersonList.add(drPerson2);

        for(Person eachPerson: thePersonList )
        {
            System.out.println(eachPerson.getFirstName());
            System.out.println("This person in a member of the "+eachPerson.getClass()+" class");

            if(eachPerson.getClass()==Doctor.class)
            {
                System.out.println("This person is a doctor");
            }
        }


    }


}



//        Get input with a for loop
//          for(int i=0; i<5; i++)
//          {
//            Person  newPerson = new Person();
//            System.out.print("Enter person's first name:");
//            newPerson.setFirstName(keyboard.nextLine());
//            thePersonList.add(newPerson);
//
//          }
//









