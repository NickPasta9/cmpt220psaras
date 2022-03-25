import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: "); 
        String str = input.nextLine();
        count(str);
    
        for (int i = 0 ; i < count(str).length ; i++) {
            System.out.println("Digit " + i + " occurs " + count(str)[i] + " times.");
        }

    }
    public static int[] count(String s) {
        int[] occurances = new int[10];

        for (int i = 0; i < s.length(); i++) {
            
            if (Character.isDigit(s.charAt(i))) {
            
                int digit = (int)s.charAt(i) - '0'; 
                
                occurances[digit] += 1;
            }

        }

        return occurances;


    }
}