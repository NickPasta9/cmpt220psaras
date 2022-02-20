import java.util.Scanner;
public class hw03Problem2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        double numerator = input.nextDouble();
        System.out.print("Enter a denominator: ");
        double denominator = input.nextDouble();

        if (numerator < denominator || numerator == denominator){
            System.out.println(numerator + " / " + denominator + " is a proper fraction.");
        }
        else if (numerator % denominator == 0){
            
            System.out.println(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + (numerator / denominator));
        }
        else if (numerator % denominator != 0){
            System.out.println(numerator + " / " + denominator + " is an improper fraction and its mixed fraction is " + ((int)numerator / (int)denominator) + " + " + (numerator % denominator) + " / " + denominator);
        }

        input.close();



    }
}