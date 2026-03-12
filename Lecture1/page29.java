import java.util.Scanner;

public class page29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = scan.nextInt();

        if (marks >= 0 && marks <= 39) {
            System.out.println("Grade: F");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Grade: C+");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: A");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else {
            System.out.println("Invalid marks!");
        }
    }
}
