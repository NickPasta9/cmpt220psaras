import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a binary string: ");
        String binaryString = input.next();
        binToDec(binaryString);
        input.close();
    }
    public static void binToDec (String binaryString) throws NumberFormatException{
        try {
        for(int i = binaryString.length() - 1; i >=0  ; i--){ 
        if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') { 
            throw new NumberFormatException();
            
        }
    }
    }
        catch (NumberFormatException ex) {
            System.out.println("Not a binary number. ");
            System.exit(1);
        }
        int decimalNumber = 0; 
        int square = 0; 

        for (int i = binaryString.length() -1; i >= 0; i--) {
            
            if (binaryString.charAt(i) == '1') { 
                decimalNumber += Math.pow(2, square) ;
            }
            square++; 
            
        }  
        System.out.println("The decimal number is " + decimalNumber);

    }
}