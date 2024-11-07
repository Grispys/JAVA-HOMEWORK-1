public class GeometricCircle implements GeometricShape{
    protected double radius = 1;
    public GeometricCircle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        double circumference = (2*Math.PI*radius);
        return(circumference);
    }
    @Override
    public double getArea() {
        double area = (Math.PI*(radius*radius));
        return(area);
    }
}
