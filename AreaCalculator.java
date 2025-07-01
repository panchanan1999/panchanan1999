public class AreaCalculator {
    public static int area(int side) {
        return side * side;
    }

    public static int area(int length, int breadth) {
        return length * breadth;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        
        System.out.println("Square area: " + area(5));
        System.out.println("Rectangle area: " + area(4, 6));
        System.out.println("Circle area: " + area(3.5));
    }
}
