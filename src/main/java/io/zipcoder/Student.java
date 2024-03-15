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
        String strExamScores = "Exam Scores:";

        for (int i = 0; i < examScores.size(); i++) {
            strExamScores += "\n" +  "Exam " + (i+1) + " -> " + Math.round(examScores.get(i));
        }
        return strExamScores;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String addExamScore(double score) {
        return String.valueOf(examScores.add(score));
    }

    public String setExamScore(int examNum, double newScore) {
        return String.valueOf(examScores.set(examNum, newScore));
    }

    public double getAverageExamScore() {
        double sum = 0;

        for (int i = 0; i < examScores.size(); i++) {
            sum += examScores.get(i);
        }

        return sum / examScores.size();
    }

    public String toString() {
        return "Student Name: " + getFirstName() + " " + getLastName() + "\n" + "> Average Score: " + Math.round(getAverageExamScore()) + "\n" + "> Exam Scores:\n" + "Exam 1 -> " + Math.round(examScores.get(0)) + "\n" + "Exam 2 -> " + Math.round(examScores.get(1)) + "\n" + "Exam 3 -> " + Math.round(examScores.get(2)) + "\n" + "Exam 4 -> " + Math.round(examScores.get(3));
    }

}
