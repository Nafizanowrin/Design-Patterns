abstract class Shape {
    public abstract double calculateArea();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    public char[] calculateArea(String string, double d, double e) {
        return null;
    }
}

class Rectangle extends Shape {
    private double width;
    private double heigth;
    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double calculateArea() {
        return width * heigth;
    }
}

public class Shape1
{

 public static void  main(String[] args){
        Circle ch = new Circle(2);
        System.out.println(ch.calculateArea());
    }
}


//Output
//12.56