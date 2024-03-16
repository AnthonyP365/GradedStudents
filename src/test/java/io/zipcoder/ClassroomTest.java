package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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
    }

}
