import java.util.Scanner;
public class MaxYears {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        double min = input.nextDouble();
        double hour = min / 60.0;
        double day = hour / 24.0;
        int year = (int)day / 365;
        int day_remaining = (int)day % 365;
        System.out.println(min + " minutes is approximately " + year + " years and " + day_remaining + " days.");
        input.close();

    }
}