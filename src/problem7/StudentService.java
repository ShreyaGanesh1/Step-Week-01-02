package problem7;

import java.util.HashMap;

public class StudentService {

    private HashMap<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
        System.out.println("Student added successfully!");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students.values()) {
            s.display();
        }
    }

    public void searchStudent(int id) {
        if (students.containsKey(id)) {
            students.get(id).display();
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        if (students.remove(id) != null) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}