public class SquareWorld {
    public static void main(String[] args){
        Square square = new Square(5);
        System.out.println("Area: " + square.area());
        square.setSideLength(7);
        System.out.println("Area: " + square.area());
        square.breadth = 4;
        System.out.println("Side length: " + square.getSideLength());
        System.out.println("Area: " + square.area());
    }
}
