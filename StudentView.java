package view;

import model.Student;

import java.util.List;

public class StudentView {
    public void displayStudentDetails(List<Student> students) {
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}