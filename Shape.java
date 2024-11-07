public abstract class Shape {
    protected String colour;
    protected boolean filled;

    public Shape(){
        this.colour = "white";
        this.filled = false;
    }

    public Shape(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour(){
        return("colour: " + this.colour);
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString(){
        return(this.colour + " + " + this.filled);
    }
}
