import java.util.Scanner;

public class TVSelector {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int selection;

        System.out.println("Enter Model Number of Desired TV.");
        System.out.println("Model 100");
        System.out.println("Model 200");
        System.out.println("Model 300");

        selection = input.nextInt();

        switch(selection) {
            case 100:
            System.out.println("Name: Model 100");
            System.out.println("Features: Remote control, timer, stereo sound.");
            System.out.println("Price: $1000.00");
            break;
            case 200:
            System.out.println("Name: Model 200");
            System.out.println("Features: Remote control, timer, stereo sound.");
            System.out.println("Price: $1200.00");
            break;
            case 300:
            System.out.println("Name: Model 300");
            System.out.println("Features: Remote control, timer, stereo sound.");
            System.out.println("Price: $2400.00");
            default:
            System.out.println("Cheapest Option: Model 100");
            System.out.println("Features: Remote control, timer, stereo sound.");
            System.out.println("Price: $1,000.00");
        }
    }
}

