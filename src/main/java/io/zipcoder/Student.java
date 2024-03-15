package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public void setFirstName(String name) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String name) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExamScores() {
        return null;
    }

   // public int getNumberOfExamsTaken() {
        //return numberOfExamsTaken;
   // }

    public void addExamScore(double score) {
        examScores.add(score);
    }

    public void setExamScore(int examNum, double newScore) {
        examScores.set(examNum, newScore);
    }

    public double getAverageExamScore() {
        double sum = 0;

        for (int i = 0; i < examScores.size(); i++) {
            sum += i;
        }

        double average = sum / examScores.size();

        return average;
    }

    public String toString() {
        System.out.println("Student Name: " + getFirstName() + getLastName());
        System.out.println("> Average Score: " + getAverageExamScore());
        System.out.println("> Exam Scores:\n" + );
    }

}
