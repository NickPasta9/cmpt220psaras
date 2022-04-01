import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble(); 
        double x2 = input.nextDouble();
        double y2 = input.nextDouble(); 
        double x3 = input.nextDouble();
        double y3 = input.nextDouble(); 
        double x4 = input.nextDouble();
        double y4 = input.nextDouble(); 
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);
        Point point4 = new Point(x4, y4);
        input.close();

        Point intersect = getIntersectingPoint(point1, point2, point3, point4);
        if (intersect != null) {
            System.out.println("Point where lines intercept: "+intersect);
        } else {
            System.out.println("The two lines are parallel");
        }
        
    }

    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4) {
        double a = p1.getY() - p2.getY();
        double b = -1 * (p1.getX() - p2.getX());
        double c = p3.getY() - p4.getY();
        double d = -1 * (p3.getX() - p4.getX());
        double e = a * p1.getX() + b * p1.getY();
        double f = c * p3.getX() + d * p3.getY();
        double determinant = a * d - b * c;
        double x = (e * d - b * f)/determinant;
        double y = (a * f - e * c)/determinant;

        if (determinant != 0) {
            Point intersectPoint = new Point(x, y);
            return intersectPoint;
        } else {
            return null;
        }
    }
}

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }
    double getY() {
        return y;
    }

    public String toString() {
        return "("+x+", "+y+")";
    }
}