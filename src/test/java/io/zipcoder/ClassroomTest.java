package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

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
                "> Average Score: 125.0\n" +
                "> Exam Scores: [100.0, 150.0, 250.0, 0.0]]";


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
        Student s1 = new Student("Leon", "Hunter", null);
        Student s2 = new Student("Donot", "Remove", null);
        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        classroom.removeStudent("Leon", "Hunter");

        boolean studentRemoved = true;
        for (Student student : students) {
            if (student != null && student.equals(s1)) {
                studentRemoved = false;
                break;
            }
        }
        Assert.assertTrue("Was student removed", studentRemoved);
    }

    @Test
    public void getStudentByScoreTest() {
        ArrayList<Double> s1Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s1Scores.add(110.0);

        ArrayList<Double> s2Scores = new ArrayList<>();
        s2Scores.add(170.0);
        s2Scores.add(110.0);

        ArrayList<Double> s3Scores = new ArrayList<>();
        s3Scores.add(200.0);
        s3Scores.add(140.0);

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s3Scores);
        Student[] students = {s1, s2, s3};
        Classroom classroom = new Classroom(students);

        Student[] expectedArray = {s3, s2, s1};
        Student[] actualArray = classroom.getStudentsByScore();

        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void getGradeBookTest() {
        ArrayList<Double> s1Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s1Scores.add(150.0);

        ArrayList<Double> s2Scores = new ArrayList<>();
        s2Scores.add(10.0);
        s2Scores.add(20.0);

//        ArrayList<Double> s3Scores = new ArrayList<>();
//        s3Scores.add(70.0);
//
//        ArrayList<Double> s4Scores = new ArrayList<>();
//        s4Scores.add(60.0);
//
//        ArrayList<Double> s5Scores = new ArrayList<>();
//        s5Scores.add(50.0);

        Student s1 = new Student("stu", "one", s1Scores);
        Student s2 = new Student("stu", "two", s2Scores);
//        Student s3 = new Student("stu", "three", s3Scores);
//        Student s4 = new Student("stu", "four", s4Scores);
//        Student s5 = new Student("stu", "five", s5Scores);
        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        Map<Student, String> expectedGrades = new HashMap<>();
        expectedGrades.put(s1, "A\n");
        expectedGrades.put(s2, "B\n");
//        expectedGrades.put(s3, "C");
//        expectedGrades.put(s4, "D");
//        expectedGrades.put(s5, "F");

        Map<Student, String> actualGrades = classroom.getGradeBook();

        Assert.assertEquals(expectedGrades, actualGrades);
    }
}
