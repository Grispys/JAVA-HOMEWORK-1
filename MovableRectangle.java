public class MovableRectangle implements Movable{

    @SuppressWarnings("unused")
    private MovablePoint topleft;
    @SuppressWarnings("unused")
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topleft.y += topleft.y;
        bottomRight.y += bottomRight.y;

    }

    @Override
    public void moveDown() {
        topleft.y -= topleft.y;
        bottomRight.y -= bottomRight.y;
    }

    @Override
    public void moveLeft() {
        topleft.x -= topleft.x;
        bottomRight.x -= bottomRight.x;
    }

    @Override
    public void moveRight() {
        topleft.x += topleft.x;
        bottomRight.x += bottomRight.x;
    }
    
}
