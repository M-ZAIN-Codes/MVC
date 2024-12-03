import controller.StudentController;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentView);

        // Predefined student data
        studentController.addStudent(101, "Alice", 3.5);
        studentController.addStudent(102, "Bob", 3.7);
        studentController.addStudent(103, "Charlie", 3.9);
        studentController.addStudent(104, "David", 3.2);

        // Display all students
        studentController.displayStudents();

        // Update a student
        studentController.updateStudent(102, "Smith", 3);

        // Display all students after update
        studentController.displayStudents();

        // Delete a student
        //studentController.deleteStudent(102);

        // Display all students after deletion
        studentController.displayStudents();
    }
}