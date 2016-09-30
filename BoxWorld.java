class Box{
    double length, breadth, height;
    
    Box(double x, double y, double z){
        length = x;
        breadth = y;
        height = z;
    }
    
    public double volume(){
        return length * breadth * height;
    }

    public double tsa(){
        double area;
        area = 2 * length * breadth;
        area += 2 * breadth * height;
        area += 2 * this.height * this.length;
        return area;
    }
}

public class BoxWorld {
    public static void main(String[] args){
        Box b = new Box(5,5,5);
        System.out.println(b.volume());
        System.out.println(b.tsa());
    }
}
