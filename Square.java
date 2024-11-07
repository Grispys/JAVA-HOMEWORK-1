public class Square extends Rectangle{

    public Square(){
        this.width = 1;
        this.length = 1;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String colour, boolean filled){
        this.width = side;
        this.length = side;
        this.colour = colour;
        this.filled = filled;
    }

    public String getSide(){
        return("Side: " + this.length);
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side){
        this.length = side;
        this.width = side;

    }
    public void setLength(double side){
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString(){
        return("Square sides: " + this.length);
    }



}
