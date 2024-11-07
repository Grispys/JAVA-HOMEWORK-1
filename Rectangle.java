
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this. length = length;
    }
    
    public Rectangle(double width, double length, String colour, boolean filled){
        this.width = width;
        this.length = length;
        this.colour = colour;
        this.filled = filled;
    }

    public double getWidth(){
        return(this.width);
    }
    public double getLength(){
        return(this.length);
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        double area = (this.length *this.width);
        return area;
    }

    @Override public double getPerimeter(){
        double perimeter =((2*this.length) + (2*this.width));
        return perimeter;
    }
    public String toString(){
        double area = this.getArea();
        double perimeter = this.getPerimeter();
        return("Area: "+ area + " Perimeter: " + perimeter);
    }
}
