public class Square extends Rectangle {
    Square(){
        
    }
    
    Square(double side_length){
        this.length = side_length;
        this.breadth = side_length;
    }
    
    public void setSideLength(double side_length){
        this.length = side_length;
        this.breadth = side_length;
    }
    
    public double getSideLength(){
        return this.length;
    }
     
}
