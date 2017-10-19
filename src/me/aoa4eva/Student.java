package me.aoa4eva;

import java.util.ArrayList;

public class Student extends Person{

    //Variables
    private ArrayList<Course> courseList;

    private Course myFavouriteCourse;

    //Constructor
    public Student(){
        courseList = new ArrayList<Course>();
    }

    //Getters and setters
    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(Course aCourse)
    {
        courseList.add(aCourse);
    }




}
