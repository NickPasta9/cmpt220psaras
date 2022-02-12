import java.util.Scanner;
public class Physicsball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ball travel time in seconds: ");
        double t = input.nextDouble();
        double d = (0 * t) + (9.8 * (t*t)) / 2;
        System.out.println("The height of the building is " + d + " meters");

    }
}