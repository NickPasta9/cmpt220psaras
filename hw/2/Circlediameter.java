import java.util.Scanner;
public class Circlediameter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = input.nextDouble();
        double diameter = 2 * radius;
        double area = 3.14 * Math.pow(radius,2);
        System.out.println("The diameter is: " + diameter);
        System.out.println("The area is: " + area);

    }
}