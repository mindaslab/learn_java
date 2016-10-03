public class ForEach {
    public static void main(String[] args){
        int collection[] = {1, 2, 3, 4};
        int i = 0;
        for(int element: collection){
            System.out.println("collection[" + i + "]:" + element);
            i++;
        }
    }
}
