/**
 * Represents a professor with attributes such as ID, name, and the course taught.
 */
public class Professor {
    private String professorId;
    private String firstName;
    private String lastName;
    private String course;

    /**
     * Constructs a Professor object with all attributes.
     *
     * @param professorId The unique identifier for the professor.
     * @param firstName   The first name of the professor.
     * @param lastName    The last name of the professor.
     * @param course      The course that the professor teaches.
     */
    public Professor(String professorId, String firstName, String lastName, String course) {
        this.professorId = professorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    /**
     * Constructs a Professor object without a course.
     *
     * @param professorId The unique identifier for the professor.
     * @param firstName   The first name of the professor.
     * @param lastName    The last name of the professor.
     */
    public Professor(String professorId, String firstName, String lastName) {
        this(professorId, firstName, lastName, "");
    }

    /**
     * Returns the professor's ID.
     *
     * @return The professor's ID.
     */
    public String getProfessorId() {
        return professorId;
    }

    /**
     * Sets the professor's ID.
     *
     * @param professorId The new ID for the professor.
     */
    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    /**
     * Returns the professor's first name.
     *
     * @return The professor's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the professor's first name.
     *
     * @param firstName The new first name of the professor.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the professor's last name.
     *
     * @return The professor's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the professor's last name.
     *
     * @param lastName The new last name of the professor.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the course the professor teaches.
     *
     * @return The course the professor teaches.
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sets the course the professor teaches.
     *
     * @param course The new course for the professor.
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Assigns a grade to a student. If the grade is below 18, the student is considered to have failed.
     *
     * @param student The student to whom the grade will be assigned.
     * @param grade   The grade to assign to the student.
     */
    public void assignGrade(Student student, int grade) {
        if (grade >= 18) {
            student.getGrades().add(grade);
        } else {
            System.out.println("===================");
            System.out.println("Grade is too low. Student has failed.");
            System.out.println("===================");
        }
    }
}
