interface Shape 
{
   void draw();
}

class Circle implements Shape 
{

   public void draw() 
   {
      System.out.println("Shape: Circle");
   }
}

class ShapeDecorator implements Shape 
{

   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape) 
   {
      this.decoratedShape = decoratedShape;
   }

   public void draw() 
   {
      decoratedShape.draw();
   }
}

public class ObjectCreation
{
   public static void main(String[]arg)
   {
      ShapeDecorator testShape = new ShapeDecorator(new Circle());
      testShape.draw();
   }
}