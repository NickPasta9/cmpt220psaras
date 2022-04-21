import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = input.next();
        binToDec(binaryString);
        input.close();
    }
    public static void binToDec (String binaryString) throws BinaryFormatException{ 
        try {
        for(int i = binaryString.length()-1; i >= 0 ; i--){
        if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
            throw new BinaryFormatException(); 
            
        }
    }
    }
        catch (BinaryFormatException ex) { 
            System.out.println("Not a binary number. BinaryException! ");
            System.exit(1);
        }

        int decimalNumber = 0;
        int square = 0;
        
        for (int i = binaryString.length() - 1 ; i >= 0; i--) {
            
            if (binaryString.charAt(i) == '1') {
                decimalNumber += Math.pow(2, square) ;
            }
            square++;
              
        }  
        System.out.println("The decimal number is " + decimalNumber);

    }
}

class BinaryFormatException extends NumberFormatException { 
    public BinaryFormatException() { 
        super();
    }

}