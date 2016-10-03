class Box{
    double length, breadth, height;
    
    Box(){
        
    }
    
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
    
    public void setDim(double x, double y, double z){
        length = x;
        breadth = y;
        height = z;
    }
}

public class BoxWorld2 {
    public static void main(String[] args){
        Box b = new Box(5,5,5);
        System.out.println(b.volume());
        System.out.println(b.tsa());
        
        Box b2 = new Box();
        b2.length = 6;
        b2.breadth = 6;
        b2.height = 6;
        System.out.println(b2.volume());
        
        Box b3 = new Box();
        b3.setDim(4, 5, 6);
        System.out.println(b3.volume());
        
        
    }
}

