class Box2{
    double length, breadth, height;
    
    Box2(double x, double y, double z){
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
        Box2 b = new Box2(5,5,5);
        System.out.println(b.volume());
        System.out.println(b.tsa());
    }
}
