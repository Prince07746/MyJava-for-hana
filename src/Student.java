import java.util.ArrayList;
import java.util.List;

/**
 * Represents a student with attributes such as ID, name, date of birth, and grades.
 */
public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String dateOfBirth; // Consider using java.time.LocalDate for better date handling
    private List<Integer> grades;

    /**
     * Constructs a Student object with all attributes.
     *
     * @param studentId   The unique identifier for the student.
     * @param firstName   The first name of the student.
     * @param lastName    The last name of the student.
     * @param dateOfBirth The date of birth of the student (as a String).
     * @param grades      The list of grades the student has obtained.
     */
    public Student(String studentId, String firstName, String lastName, String dateOfBirth, List<Integer> grades) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }

    /**
     * Constructs a Student object with an empty grades list.
     *
     * @param studentId   The unique identifier for the student.
     * @param firstName   The first name of the student.
     * @param lastName    The last name of the student.
     * @param dateOfBirth The date of birth of the student (as a String).
     */
    public Student(String studentId, String firstName, String lastName, String dateOfBirth) {
        this(studentId, firstName, lastName, dateOfBirth, new ArrayList<>());
    }

    /**
     * Returns the student's ID.
     *
     * @return The student ID.
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets the student's ID.
     *
     * @param studentId The new student ID.
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Returns the student's first name.
     *
     * @return The student's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the student's first name.
     *
     * @param firstName The new first name of the student.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the student's last name.
     *
     * @return The student's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the student's last name.
     *
     * @param lastName The new last name of the student.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the student's date of birth.
     *
     * @return The student's date of birth as a String.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the student's date of birth.
     *
     * @param dateOfBirth The new date of birth of the student.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the list of grades.
     *
     * @return A list of integers representing the student's grades.
     */
    public List<Integer> getGrades() {
        return grades;
    }

    /**
     * Sets the grades for the student.
     *
     * @param grades A list of integers representing the new grades for the student.
     */
    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    /**
     * Calculates the average of the student's grades.
     *
     * @return The average grade, or 0.0 if the student has no grades.
     */
    public double calculateGradeAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    /**
     * Checks if the student is excellent.
     * A student is considered excellent if their average grade is greater than or equal to 28.
     *
     * @return {@code true} if the student is excellent, otherwise {@code false}.
     */
    public boolean isExcellent() {
        return calculateGradeAverage() >= 28;
    }
}
