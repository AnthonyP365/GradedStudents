package io.zipcoder;

import java.util.ArrayList;

public class Student {
//    Instance Variables
    private String firstName;
    private String lastName;
    private final ArrayList<Double> examScores;

//    Constructor

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

//    Getters and Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public void setExamScore(Integer examNumber, Double newScore) {
        examScores.set(examNumber, newScore);
    }

//    Methods

    public String getStringExamScores() {
        return examScores.toString();
    }

    public void addExamScore(Double exam) {
        examScores.add(exam);
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < getNumberOfExamsTaken(); i++) {
            sum += examScores.get(i);
        }
        return sum / getNumberOfExamsTaken();
    }

    @Override
    public String toString() {
        return "Student Name: " + getFirstName() + " " + getLastName() + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n" +
                "> Exam Scores: " + examScores;
    }
}