public class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled){
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    public double getRadius(){
        return(this.radius);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = (Math.PI*(radius*radius));
        return(area);
    }
    @Override
    public double getPerimeter(){ //remember kids, circles have circumferences, not perimeters
        double circumference = (2*Math.PI*radius);
        return(circumference);
    }
}
