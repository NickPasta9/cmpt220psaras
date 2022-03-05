import java.util.Scanner;
public class Problem3 {
    
    public static String title(String s) {

        char[] c = s.toCharArray();

        c[0] = Character.toUpperCase(c[0]);
        for (int i = 0; i < c.length; i++) {

            if (c[i] == ' ') {
                c[i+1] = Character.toUpperCase(c[i+1]);
            }
        }
        return String.valueOf(c);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sInput = input.nextLine();
        input.close();


        System.out.println("The new string is: "+title(sInput));
    }
}