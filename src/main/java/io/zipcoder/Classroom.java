package io.zipcoder;

import java.util.*;

public class Classroom {
    public Student[] students;

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
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

// This method sorts an array of Student objects primarily by their average exam scores in descending order.
// If there are students with the same average exam scores, it sorts them by first name and then by last name.
// Any Student objects with a null average exam score are placed at the end of the sorted array.
    public Student[] getStudentsByScore() {
        Arrays.sort(students, Comparator.nullsLast(Comparator.comparing(Student::getAverageExamScore).reversed().thenComparing(Student::getFirstName).thenComparing(Student::getLastName)));
        return students;
    }

    public Map<Student, String> getGradeBook() {
        Student[] sortedStudents = getStudentsByScore();
        Map<Student, String> gradeBook = new LinkedHashMap<>();

        int totalStudents = sortedStudents.length;
        int upper10th = totalStudents / 10;
        int upper30th = totalStudents * 3 / 10;
        int upper50th = totalStudents / 2;
        int lower51st = totalStudents * 51 / 100;
        //int lower11th = totalStudents * 11 / 100;

        for (int i = 0; i < totalStudents; i++) {
            if (i < upper10th) {
                gradeBook.put(sortedStudents[i], "A");
            } else if (i < upper30th) {
                gradeBook.put(sortedStudents[i], "B");
            } else if (i < upper50th) {
                gradeBook.put(sortedStudents[i], "C");
            } else if (i < lower51st) {
                gradeBook.put(sortedStudents[i], "D");
            } else {
                gradeBook.put(sortedStudents[i], "F");
            }
        }
        return gradeBook;
    }

}
