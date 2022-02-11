import java.util.Scanner;
 public class PhysicsFriction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter the friction force(Newtons): ");
            double f = input.nextDouble();
            System.out.println("Enter the object's mass(kg): ");
            double m = input.nextDouble();
            System.out.println("Enter the object's acceleration(m/s^2): ");
            double a = input.nextDouble();
            double u = (-(a*m-f))/(9.8*m);
            System.out.println("The coefficient for friction is " + u);

    }
}