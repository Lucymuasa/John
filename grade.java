public class StudentGrade {
    public static void main(String[] args) {
        double averageMarks = 82.5; // Assuming the average marks obtained
        
        // Determine grade based on average marks
        String grade;
        if (averageMarks >= 93.0) {
            grade = "A";
        } else if (averageMarks >= 85.0) {
            grade = "B";
        } else if (averageMarks >= 80.0) {
            grade = "C";
        } else if (averageMarks >= 75.0) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        // Print grade
        System.out.println("Grade: " + grade);
        
        // Determine pass or fail based on average marks and passing threshold
        String passOrFail = (averageMarks >= 75.0) ? "Pass" : "Fail";
        
        // Print pass or fail
        System.out.println("Result: " + passOrFail);
    }
}
