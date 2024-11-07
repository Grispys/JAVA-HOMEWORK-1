public class ResizableCircle extends GeometricCircle implements Resizable {

    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public double Resize(int percent) {
        this.radius += this.radius * (percent / 100.0);
        return this.radius;
    }

    @Override public String toString(){
        return("Radius: " + this.radius);
    }
    
}
