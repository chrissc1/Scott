public class Student {
    /* Instance Variables */
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    /* Constructor; see Note 1 below */
    public Student(String firstName, String lastName, int gradYear) {

    }

    /* Getter Methods */
// Returns firstName
    public String getFirstName() {
        return firstName;
    }

    // Returns lastName
    public String getLastName() {
        return lastName;
    }

    /* Setter Methods */
// Sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {

    }

    /* All Other Methods */
// Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double newTestScore) {

    }

    // Returns true if the student’s average test score is greater
// than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        return
    }

    // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        return
    }

    // this method prints the students full name, grad year, test average,
// and whether they are passing (see Note 3 below)
    public void printStudentInfo() {

    }

}
