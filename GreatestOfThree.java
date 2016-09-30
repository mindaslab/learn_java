public class GreatestOfThree {
    public static void main(String[] args){
        int a = 1, b = 2, c = 3;
        if(a >= b && a >= c) System.out.println("a is greatest");
        if(b >= a && b >= c) System.out.println("b is greatest");
        if(c >= b && c >= a) System.out.println("c is greatest");
    }
    
}
