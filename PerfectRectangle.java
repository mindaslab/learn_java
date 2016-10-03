public class PerfectRectangle {
    private double length;
    private double breadth;
    
    PerfectRectangle(){
        
    }
    
    PerfectRectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public double area(){
        return length * breadth;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public void setBreadth(double breadth){
        this.breadth = breadth;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getBreadth(){
        return this.breadth;
    }
}
