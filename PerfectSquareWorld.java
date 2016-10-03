public class PerfectSquareWorld {
    public static void main(String[] args){
        PerfectSquare square = new PerfectSquare(5);
        System.out.println("Area: " + square.area());
        square.setLength(7);
        System.out.println("Area: " + square.area());
        square.setBreadth(4);
        System.out.println("Side length: " + square.getLength());
        System.out.println("Area: " + square.area());
    }
}
