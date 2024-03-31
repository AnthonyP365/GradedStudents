package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class StudentTest {
    @Test
    public void getExamScoresTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);

        String expectedExamScores = "[100.0, 95.0, 123.0, 96.0]";
        String actualExamScores = student.getExamScores().toString();

        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void addExamScoresTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);

        student.addExamScore(100.0);

        String expectedExamScores = "[100.0]";
        String actualExamScores = student.getExamScores().toString();

        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void setExamScoresTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        Student student = new Student(firstName, lastName, examScores);

        student.setExamScore(0, 150.0);

        String expectedExamScores = "[150.0, 95.0]";
        String actualExamScores = student.getExamScores().toString();

        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void getAverageExamScoreTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(50.0);
        Student student = new Student(firstName, lastName, examScores);

        Double expectedAverageExamScore = 137.5;
        Double actualAverageExamScore = student.getAverageExamScore();

        Assert.assertEquals(expectedAverageExamScore, actualAverageExamScore);
    }

    @Test
    public void toStringTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        Student student = new Student(firstName, lastName, examScores);

        String expectedString = "Student Name: Leon Hunter\n" +
                "> Average Score: 97.5\n" +
                "> Exam Scores: [100.0, 95.0]";

        String actualString = student.toString();

        Assert.assertEquals(expectedString, actualString);
    }




}