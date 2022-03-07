import java.util.*;
public class Problem2 {
    
    // JA: This function returns the wrong string
    public static String decimalToBinary(int value) {

        int[] binaryN = new int[11];
        int count = 0;

        while (value > 0) {
            binaryN[count] = value % 2;
            value = value / 2;
            count++;
        }
        int[] reverse = new int[binaryN.length];
        for (int i = 0, j = reverse.length - 1; i < binaryN.length; i++, j--)
           reverse[j] = binaryN[i];
        String binaryStr = Arrays.toString(reverse);
        return binaryStr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        input.close();
        System.out.println("The binary value is "+decimalToBinary(n));
    }
}