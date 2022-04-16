import java.util.Scanner;
import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = input.nextLine();

        System.out.println("Enter delimeters: ");
        String delim = input.nextLine();
        for (int i = 0; i < split(s,delim).size(); i++) {
            System.out.println(split(s,delim).get(i));
        }
        input.close();
    }
    public static ArrayList<String> split(String s, String delimiters) {
        
        ArrayList<String> mutableString = new ArrayList<>();

        for (int i = 0 ;i< s.length(); i++) {
            mutableString.add(s.charAt(i) + "");
        }

        ArrayList<String> delimiterArray = new ArrayList<>();
        for (int i = 0 ;i< delimiters.length(); i++) { 
            delimiterArray.add(delimiters.charAt(i) + "");
        }

        for (int i = 0; i < delimiters.length(); i++) {
            for (int j = 0 ; j < s.length(); j++) {
                if (mutableString.get(j).equals(delimiterArray.get(i))) {
                    mutableString.set(j, " ");
                }
            }
        }

        
        return mutableString; 
    }
}