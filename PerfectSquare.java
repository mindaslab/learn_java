public class PerfectSquare extends PerfectRectangle {
    PerfectSquare(){
        
    }
    
    PerfectSquare(double side_length){
       this.setLength(side_length);
       this.setBreadth(side_length);
    }
    
    public void setLength(double side_length){
       super.setLength(side_length);
       super.setBreadth(side_length);
    }
    
    public double getLength(){
        return super.getLength();
    }
    
    public void setBreadth(double side_length){
       super.setLength(side_length);
       super.setBreadth(side_length);
    }
    
    public double getBreadth(){
        return super.getBreadth();
    }
}
