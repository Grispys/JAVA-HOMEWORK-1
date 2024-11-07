public class ResizableCircle extends GeometricCircle implements Resizable {

    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public double Resize(int percent) {
        this.radius += this.radius * (percent / 100);
        return this.radius;
    }
    
}
