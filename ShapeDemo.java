public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape 

System.out.println(s1);                    // which version? 

System.out.println(s1.getArea());          // which version? 

System.out.println(s1.getPerimeter());     // which version? 

System.out.println(s1.getColour()); 

System.out.println(s1.isFilled()); 

System.out.println(((Circle) s1).getRadius()); //this originally triggered an error. it must be downcast

    

Circle c1 = (Circle)s1;                   // Downcast back to Circle 

System.out.println(c1); 

System.out.println(c1.getArea()); 

System.out.println(c1.getPerimeter()); 

System.out.println(c1.getColour()); 

System.out.println(c1.isFilled()); 

System.out.println(c1.getRadius()); 

    

// Shape s2 = new Shape(); i commented this one out. you can't instantiate Shape().

    

Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast 

System.out.println(s3); 

System.out.println(s3.getArea()); 

System.out.println(s3.getPerimeter()); 

System.out.println(s3.getColour()); 

System.out.println(((Rectangle) s3).getLength()); // like getRadius before, must be downcast to work

    

Rectangle r1 = (Rectangle)s3;   // downcast 

System.out.println(r1); 

System.out.println(r1.getArea()); 

System.out.println(r1.getColour()); 

System.out.println(r1.getLength()); 

    

Shape s4 = new Square(6.6);     // Upcast 

System.out.println(s4); 

System.out.println(s4.getArea()); 

System.out.println(s4.getColour()); 

System.out.println(((Square) s4).getSide()); //must be downcasted yet again

   

// Take note that we downcast Shape s4 to Rectangle,  

//  which is a superclass of Square, instead of Square 

Rectangle r2 = (Rectangle)s4; 

System.out.println(r2); 

System.out.println(r2.getArea()); 

System.out.println(r2.getColour()); 

System.out.println(((Square) r2).getSide()); //i shouldn't have to explain this one

System.out.println(r2.getLength()); 

    

// Downcast Rectangle r2 to Square 

Square sq1 = (Square)r2; 

System.out.println(sq1); 

System.out.println(sq1.getArea()); 

System.out.println(sq1.getColour()); 

System.out.println(sq1.getSide()); 

System.out.println(sq1.getLength()); 
    }
}
