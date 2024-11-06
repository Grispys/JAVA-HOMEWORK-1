 public class MovableCircle implements Movable { // saved as "MovableCircle.java" 

   private MovablePoint center;
   @SuppressWarnings("unused")
   private int radius; 

    

   // Constructor 

   public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) { 
      // Call the MovablePoint's constructor to allocate the center instance. 
      center = new MovablePoint(x, y, xSpeed, ySpeed); 
      this.radius = radius;
   } 
   
   public String toString(){
      return("x:" + center.x + "y:"  + center.y +  "yspeed:" + center.ySpeed + "xspeed:" + center.xSpeed + "radius: " + radius);
   }

   @Override 
   public void moveUp() { 
      center.y -= center.ySpeed; 
   }




   @Override
   public void moveDown() {
      center.y += center.ySpeed;
   }




   @Override
   public void moveLeft() {
      center.x -= center.xSpeed;
   }




   @Override
   public void moveRight() {
      center.x += center.xSpeed;
   } 


} 