import java.util.Scanner;
public class FlooringSelector {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String selection;

        System.out.println("Enter Which Option for the floor plan would you like?");
        System.out.println("Option 1 Scored Concrete");
        System.out.println("Option 2 Carpenting");
        System.out.println("Option 3 Wood floors in living areas, carpeting in bedrooms, tile in bath areas");          

        selection = input.nextLine();

        switch(selection) {
            case "Option 1":
            System.out.println("Floor: Scored Concrete");
            System.out.println("Price: $1,000.00");
            break;
            case "Option 2":
            System.out.println("Floor: Carpenting");
            System.out.println("Price: $5,000.00");
            break;
            case "Option 3":
            System.out.println("Floor: Wood Floors in living areas, carpenting in bedroom, tile in bathroom");
            System.out.println("Price: $10,000.00");
            default:
            System.out.println("Cheapest Option: Scored Concrete");
            System.out.println("Price: $1,000.00");
        }
    }
}