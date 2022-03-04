import java.util.Scanner;
public class Problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer to multiply it's digits: ");
        long nInput = input.nextLong();
        input.close();
        System.out.println(multiplyDigits(nInput));
    }
    public static int multiplyDigits(long n) {

        int product = 1;
        while (n != 0) {
            product = (int) (product * (n % 10));
            n = n / 10;
        }
        return product;
    }
}