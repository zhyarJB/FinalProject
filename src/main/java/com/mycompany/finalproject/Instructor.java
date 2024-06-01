package com.mycompany.finalproject;

public class Instructor extends Staff {
    private int practicalHours;
    
    public void setHours(int hours){
        practicalHours = hours;
    }
    public int getHours(){
        return practicalHours;
    }
    
}
