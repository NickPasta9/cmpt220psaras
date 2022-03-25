public class Problem1 {
    public static void main(String[] args) {
        
        int[] count = new int[10];
        
        int random_num = 0;
    
        for (int i = 0; i < 100; i++){
            
            random_num = (int)(Math.random() * 10) ; 
            count[random_num] += 1;
        }
        for (int j = 0 ; j < 10 ; j++) {
            System.out.println("there are " + count[j] + " " + j + "\s");
        }
    }
    
}