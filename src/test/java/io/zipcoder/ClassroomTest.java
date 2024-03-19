package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {


    @Test
    public void addStudentTest() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(0.0);
        Student student = new Student("Leon", "Hunter", examScores);

        String expectedAddStudent = "[Student Name: Leon Hunter\n" +
                "> Average Score: 125\n" +
                "> Exam Scores:\n" +
                "Exam 1 -> 100\n" + "Exam 2 -> 150\n" + "Exam 3 -> 250\n" + "Exam 4 -> 0]";

        classroom.addStudent(student);
        String actualAddStudent = Arrays.toString(classroom.getStudents());

        Assert.assertEquals(expectedAddStudent, actualAddStudent);
    }

    @Test
    public void getAverageExamScoreTest() {
        ArrayList<Double> s1Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s1Scores.add(150.0);

        ArrayList<Double> s2Scores = new ArrayList<>();
        s2Scores.add(225.0);
        s2Scores.add(25.0);

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        double expectedAverageExamScore = 125.0;
        double actualAverageExamScore = classroom.getAverageExamScore();

        Assert.assertEquals(expectedAverageExamScore, actualAverageExamScore, 0.1);
    }

    @Test
    public void removeStudentTest() {
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Student student = new Student("Leon", "Hunter", null);
        Student student1 = new Student("Do Not", "Remove", null);

        classroom.addStudent(student);
        classroom.addStudent(student1);

        Student[] expectedRemoveStudent = null;
        Student[] actualRemoveStudent = classroom.removeStudent();

        classroom.getStudents();
    }

}
