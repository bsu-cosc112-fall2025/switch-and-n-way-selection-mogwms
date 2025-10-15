import java.util.Scanner;

public class GradeFeedback {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int grade;

        System.out.println("Enter your numeric grade.");
        grade = input.nextInt();
        if (grade >= 90) {
            System.out.println("A: Excellent!");
        } else if (grade >= 80) {
            System.out.println("B: Good Job!");
        } else if (grade >= 70) {    
            System.out.println("C: Fair effort.");
        } else if (grade >= 60) {
            System.out.println("D: Needs improvement.");
        } else if (grade >= 50) {
            System.out.println("F: Failing grade.");
        } else {
        }
    }
}
