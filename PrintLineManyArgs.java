/**
 *
 * @author ak
 */
public class PrintLineManyArgs {
    public static void printLine(String a, int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(a);
        }
        System.out.println();
    }
    
    public static void printLine(String a) {
        printLine(a, 50);
    }
    
    // Function overloading
    public static void printLine(){
        printLine("*");
    }
    
    
    public static void printLine(int length){
        printLine("*", length);
    }
    

    public static void main(String[] f) {
        printLine("!");
        printLine("&");
        printLine();
        printLine(100);
        printLine("-", 200);
    }
}
