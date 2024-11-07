//Class Circle inherits from class Shape and implements methods from TwoDimensional interface
public class Circle extends Shape implements TwoDimensional{
    private double radius;

    //constructor for the Circle class
    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    //getter to get the radius of the circle
    public double getRadius() {
        return radius;
    }

    //overrides the area method from the TwoDimensional interface
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    //overrides the perimeter method from the TwoDimensional interface
    @Override
    public double perimeter() {
        return (Math.PI*(radius*2)) ;
    }

    //overrides the toString method from class Shape
    @Override
    public String toString() {
        return super.toString() +" ,radius:"+getRadius();
    }
}
