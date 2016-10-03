public class Rectangle {
    public double length;
    public double breadth;
    
    Rectangle(){
        
    }
    
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public double area(){
        return length * breadth;
    }
}
