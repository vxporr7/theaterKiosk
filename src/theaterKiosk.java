import java.util.Scanner;
public class theaterKiosk {
    public static void main(String[] args) {
        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a wristband!");
            } else if (age <= 21) {
                System.out.println("No wristband");
            }
        }
    }
}