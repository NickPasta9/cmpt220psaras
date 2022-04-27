import java.util.Scanner;
import java.util.ArrayList;

// JA: This solution seems to remove duplicate weights
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of objects: ");
        int objectsNum = input.nextInt();
        
        ArrayList<Integer> weights = new ArrayList<>();
        System.out.println("Enter the weights of the objects: ");  
        for(int i = 0; i < objectsNum; i++) { 
            int objectWeight = input.nextInt();
            weights.add(objectWeight);
        }
        java.util.Collections.sort(weights); 
        int containerNumber = 0;
        int beginIndex = 0; 
        int endIndex = weights.size() - 1; 
       
        while (true) {  
            if (weights.get(beginIndex) + weights.get(endIndex) == 10) { 
                System.out.println("Container " + ++containerNumber + " has weights " + weights.get(beginIndex) + " " + weights.get(endIndex));
                endIndex--;
                if (endIndex <= beginIndex || endIndex == 0 || beginIndex == weights.size()- 1) {
                    break;
                }
            }
            beginIndex++;


        }  
        input.close();
    }
}