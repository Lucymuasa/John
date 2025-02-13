public class Grade Evaluator {
    public static void main(String[] args) {
        int[] marks = {90, 85, 78, 92, 88};
        evaluateGradeAndPassStatus(marks);
    }

    public static void evaluateGradeAndPassStatus (int[] marks) {
        // Calculate the average marks
        double average Marks = calculate Average(marks);

        // Determine the grade and pass status
        String grade;
        String pass Status;
        if (average Marks >= 93) {
            grade = "A";
            pass Status = "passed";
        } else if (average Marks >= 85) {
            grade = "B";
            pass Status = "passed";
        } else if (average Marks >= 80) {
            grade = "C";
            pass Status = "passed";
        } else if (average Marks >= 75) {
            grade = "D";
            pass Status = "passed";
        } else {
            grade = "E";
            pass Status = "fail";
        }

        // Print the results
        System.out.printf("Average Marks: %.2f%n", average Marks);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + pass Status);
    }
    public static double calculate Average(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark
  }
        return (double) sum / marks. Length;
    }
}
