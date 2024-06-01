package com.mycompany.finalproject;
public class Course {
    private String courseId;
    private String courseName;
    
    public Course(String c_name){
        courseName = c_name;
    }
    public void setCourseName(String name){
        courseName = name;
    }
    public String getName(){
        return courseName;
    }
    public void setCourseId(String id){
        courseId = id;
    }
}
