import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();

        int total = 0;
        System.out.println("Enter marks (out of 100) for each subject:");
        for (int i = 1; i <= n; i++) {
            System.out.print(" Subject " + i + ": ");
            int mark = scanner.nextInt();
            total += mark;
        }

        double average = (double) total / n;
        
        // Calculate grade based on average percentage
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nResult:");
        System.out.println("Total Marks     = " + total + " / " + (n * 100));
        System.out.printf("Average Percent = %.2f%%\n", average);
        System.out.println("Grade           = " + grade);

        scanner.close();
    }
}
