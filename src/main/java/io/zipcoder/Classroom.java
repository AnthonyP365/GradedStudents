package io.zipcoder;

import java.util.*;

public class Classroom {
//    Instance Variables
    private final Student[] students;

//    Constructors

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] students) {
        this.students = students;
    }
    public Classroom() {
        this.students = new Student[30];
    }

//    Getter for students

    public Student[] getStudents() {
        return students;
    }

//    Methods

    public Double getAverageExamScore() {
        double sum = 0;
        int count = 0;

        for (Student student : students) {
            if (student != null) {
                sum += student.getAverageExamScore();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
                break;
            }
        }
    }

// This method sorts an array of Student objects by their average exam scores in descending order.
// If there are students with the same average exam scores, it sorts them by first name and then by last name.
// Any Student objects with a null average exam score are placed at the end of the sorted array.
    public Student[] getStudentsByScore() {
        Arrays.sort(students, Comparator.nullsLast(Comparator.comparing(Student::getAverageExamScore)
                .reversed()
                .thenComparing(Student::getLastName)
                .thenComparing(Student::getFirstName)));
        return students;
    }

    public Map<Student, String> getGradeBook() {
        Student[] sortedStudents = getStudentsByScore();
        Map<Student, String> gradeBook = new HashMap<>();

        int totalStudents = sortedStudents.length;
        int upper10th = totalStudents / 10;
        int upper30th = totalStudents * 2 / 10;
        int upper50th = totalStudents * 5 / 10;
        int lower51st = totalStudents - upper10th;

        for (int i = 0; i < totalStudents; i++) {

            if (i < upper10th) {
                gradeBook.put(sortedStudents[i], "C\n\n");
            } else if (i < upper30th) {
                gradeBook.put(sortedStudents[i], "B\n\n");
            } else if (i < upper50th) {
                gradeBook.put(sortedStudents[i], "A\n\n");
            } else if (i < lower51st) {
                gradeBook.put(sortedStudents[i], "D\n\n");
            } else {
                gradeBook.put(sortedStudents[i], "F\n\n");
            }
        }
        return gradeBook;
    }
}
