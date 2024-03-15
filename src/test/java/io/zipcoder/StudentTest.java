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
        String expectedExamScores = "Exam Scores: \n" + 100.0 + "\n" + 95.0 + "\n" + 123.0 + "\n" + 96.0;
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
        String expectedAddExamScore = "Exam Scores: \n" + 100.0;
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

        // When
        student.setExamScore(1, 150.0);
        String expectedExamScore = "Exam Scores: \n" + 100;
        String actualExamScore = student.getExamScores();

        // Then
        Assert.assertEquals(expectedExamScore, actualExamScore);
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
        double expectedExamScore = 312.5;
        double actualExamScore = student.getAverageExamScore();

        // Then
        Assert.assertEquals(expectedExamScore, actualExamScore);
    }

}