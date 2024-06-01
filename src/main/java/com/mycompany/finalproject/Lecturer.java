package com.mycompany.finalproject;
public class Lecturer extends Staff{
    private int lectureHours;
    
    public void setHours(int hours){
        lectureHours = hours;
    }
    public int getHours(){
        return lectureHours;
    }
}
