import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[6][2];  
    
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Enter " + " x value of point " + (i+1) + ":  "); 
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
                System.out.print("Enter " +  " y value of point " + (i+1) + " :  "); 
            }
        }
        
        (x1y2 - y1x2) +	(x2y3 -y2x3) ..... + (xny1 - ynx1 )  /  2
        
        double area = 0; 
        for (int i = 1 ; i < 6; i++) { 
            area += (matrix[(i-1)][0] * matrix[i][1]) - (matrix[i][0] * matrix[(i-1)][1]) ;
        }

        area = area / 2;
        System.out.println(" " );
        System.out.println("The area is " + area);
        input.close();
    }
}