package com.mycompany.finalproject;
public class Subject {
    private String subjectID;
    private String subjectName;
    private int numberOfCredits;

    // Constructor
    public Subject(String subjectID, String subjectName, int numberOfCredits) {
        this.subjectName = subjectName;
        this.numberOfCredits = numberOfCredits;
    }


    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }


    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }
}


