public class MovablePoint implements Movable { // saved as "MovablePoint.java" 

   // instance variables 

   int x, y, xSpeed, ySpeed;     // package access 

   // Constructor 

   public MovablePoint(int x, int y, int xSpeed, int ySpeed) { 

      this.x = x; 

      this.y = y;

      this.xSpeed = xSpeed;
      
      this.ySpeed = ySpeed;

   }     

   // Implement abstract methods declared in the interface Movable 

   @Override 

   public void moveUp() { 

      y -= ySpeed;   // y-axis pointing down for 2D graphics 

   }

   public String toString(){
    return("x:" + this.x + "y:"  + this.y +  "yspeed:" + this.ySpeed + "xspeed:" + this.xSpeed);
 }

@Override
public void moveDown() {
    y += ySpeed;
}

@Override
public void moveLeft() {
    x -=xSpeed;
}

@Override
public void moveRight() {
    x+= xSpeed;
} 
 

}