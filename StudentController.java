package controller;

import model.Student;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students;
    private StudentView studentView;

    public StudentController(StudentView studentView) {
        this.students = new ArrayList<>();
        this.studentView = studentView;
    }

    public void addStudent(int rollNo, String name, double gpa) {
        Student student = new Student(rollNo, name, gpa);
        students.add(student);
        studentView.displayMessage("Student added: " + student);
    }

    public void displayStudents() {
        studentView.displayStudentDetails(students);
    }

    public void updateStudent(int rollNo, String name, double gpa) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                students.remove(student);
                students.add(new Student(rollNo, name, gpa));
                studentView.displayMessage("Student updated: " + student);
                return;
            }
        }
        studentView.displayMessage("Student with Roll No " + rollNo + " not found.");
    }

    public void deleteStudent(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                students.remove(student);
                studentView.displayMessage("Student deleted: " + student);
                return;
            }
        }
        studentView.displayMessage("Student with Roll No " + rollNo + " not found.");
    }
}