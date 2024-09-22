import java.util.ArrayList;
import java.util.List;

/**
 * Main class to test the Student and Professor classes.
 * Author: Hana Debay
 */
public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S001", "Hana", "Debay", "1987-02-01");
        Student student2 = new Student("S002", "David", "Prince", "1990-12-02");
        Student student3 = new Student("S003", "Mirgisa", "Kitata", "1992-03-09");
        Student student4 = new Student("S004", "Abel", "Teshome", "1994-08-08");

        // Create professors
        Professor professor1 = new Professor("P001", "Mr. Huseyin", "Gurey", "Java");
        Professor professor2 = new Professor("P002", "Ms. Erica", "Moore");

        // Assign grades
        professor1.assignGrade(student1, 30);
        professor1.assignGrade(student2, 25);
        professor2.assignGrade(student3, 29);
        professor2.assignGrade(student4, 15); // This will print a failure message

        // Store students in an array
        Student[] students = {student1, student2, student3, student4};
        Professor[] professors = {professor1, professor2};

        // Print excellent students
        System.out.println("Excellent Students:");
        System.out.println("=================== ");
        for (Student student : students) {
            if (student.isExcellent()) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }

        // Find student with the highest grade average
        Student topStudent = null;
        double highestAverage = 0.0;
        for (Student student : students) {
            double average = student.calculateGradeAverage();
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = student;
            }
        }
        System.out.println("===================");
        if (topStudent != null) {
            System.out.println("Top Student: " + topStudent.getFirstName() + " " + topStudent.getLastName());
        }
        System.out.println("===================");
    }
}
