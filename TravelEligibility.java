import java.util.Scanner;

public class TravelEligibility {
    public static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
        int age;
        boolean hasPassport = false;

        System.out.println("What is your age?");
        age = input.nextInt();

        System.out.println("Do you have a passport? (true or false)");
        hasPassport = input.nextBoolean();

        if (age >= 18) {
            if (hasPassport) {
                System.out.println("Eligible to travel internationally.");
            } else {
                System.out.println("Not Eligible - Get a passport to travel.");
            }
        } else if (age < 18) {
            if (hasPassport) {
                System.out.println("Eligible to travel with a guardian.");
            } else {
                System.out.println("Not Eligible.");
            }
        }
    }
}
