public class FunctionReturn {
    public static int factorial(int number){
        int output = 1;
        for(; number > 0; number--){
            output *= number;
        }
        return output;
    }
    
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}
