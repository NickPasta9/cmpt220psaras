public class hw03Problem4 {
    public static void main(String[] args) {
       
        double distance; 
        double x; 
        double y;
        do{
            x = Math.random() * 10 - 5;
            y = Math.random() * 10 - 5;
            distance = Math.sqrt(x*x + y*y);
        }while(distance > 5);

        System.out.println("The point is ("+x+", "+y+")");
        System.out.println("and the distance to the center is "+distance);

    }
}