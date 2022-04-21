import java.util.Scanner;
import java.util.ArrayList;
public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0 ; i < 100; i++) {
            intArray.add((int)(100 * Math.random())); 
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter index of array: "); 
        int index = input.nextInt();

        try {
        System.out.println("The element content of the specified index is " + intArray.get(index)); 
        }

        catch (IndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds!");
        }
        input.close();
     }
}