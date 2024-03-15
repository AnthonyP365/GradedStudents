package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        String expectedExamScores = "Exam Scores:\n" + "Exam 1 -> " + 100 + "\n" + "Exam 2 -> " + 95 + "\n" + "Exam 3 -> " + 123 + "\n" + "Exam 4 -> " + 96;
        String actualExamScores = student.getExamScores();

        // Then
        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void addExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String expectedAddExamScore = "Exam Scores:\n" + "Exam 1 -> " + 100;
        String actualAddExamScore = student.getExamScores();

        // Then
        Assert.assertEquals(expectedAddExamScore, actualAddExamScore);
    }

    @Test
    public void setExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(100.0);

        // When
        student.setExamScore(0, 150.0);
        String expectedSetExamScore = "Exam Scores:\n" + "Exam 1 -> " + 150;
        String actualSetExamScore = student.getExamScores();

        // Then
        Assert.assertEquals(expectedSetExamScore, actualSetExamScore);
    }

    @Test
    public void getAverageExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        double expectedAverageExamScore = 125.0;
        double actualAverageExamScore = student.getAverageExamScore();

        // Then
        Assert.assertEquals(expectedAverageExamScore, actualAverageExamScore, 0.1);
    }

    @Test
    public void toStringTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        String expectedString = "Student Name: Leon Hunter" + "\n" + "> Average Score: " + 125 + "\n" + "> Exam Scores:\n" + "Exam 1 -> " + 100 + "\n" + "Exam 2 -> " + 150 + "\n" + "Exam 3 -> " + 250 + "\n" + "Exam 4 -> " + 0;
        String actualString = student.toString();

        // Then
        Assert.assertEquals(expectedString, actualString);
    }

}