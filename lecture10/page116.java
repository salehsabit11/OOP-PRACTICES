import java.util.Scanner;
//CGPA CALCULATOR
public class page116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 5;
        int subjects = 5;

        double[][] gradePoints = new double[students][subjects];
        int[] credits = new int[subjects];

        // Input credits
        System.out.println("Enter credits for each subject:");
        for (int i = 0; i < subjects; i++) {
            credits[i] = sc.nextInt();
        }

        // Input grade points
        for (int i = 0; i < students; i++) {
            System.out.println("Enter grade points for Student " + (i + 1));
            for (int j = 0; j < subjects; j++) {
                gradePoints[i][j] = sc.nextDouble();
            }
        }

        // Calculate CGPA
        for (int i = 0; i < students; i++) {
            double total = 0;
            int totalCredits = 0;

            for (int j = 0; j < subjects; j++) {
                total += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = total / totalCredits;
            System.out.println("CGPA of Student " + (i + 1) + ": " + cgpa);
        }

        sc.close();
    }
}
