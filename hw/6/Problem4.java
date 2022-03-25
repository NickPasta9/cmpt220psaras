import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        

        double[][] matrix = new double[2][2];
        matrix[0][0] = a;
        matrix[0][1] = b;   
        matrix[1][0] = c;
        matrix[1][1] = d;
        
        if (inverse(matrix) == null){ 
            System.out.println("No inverse matrix. "); 
        }
        else{
            
        for (int i = 0 ; i < matrix.length ; i++) {
            System.out.println(" ");
            for (int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " " );
            }
        }
    }
       
        
    }
    public static double[][] inverse(double[][] A) {
        
        boolean eqNull = ((A[0][0] * A[1][1]) - (A[0][1] * A[1][0])) == 0;  
        if (eqNull) { 
            return null;
        }
        double eq = 1 / ((A[0][0] * A[1][1]) - (A[0][1] * A[1][0])); 
        
        double temp = A[0][0];
        A[0][0] = temp;
        A[0][0] = A[1][1] * eq;   
        A[1][1] = temp * eq;
        A[0][1] *= -eq;            
        A[1][0] *= -eq;

        return A; 

    }
}