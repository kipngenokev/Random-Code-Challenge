//pentagon class inherits from the Shape class and implements methods from TwoDimensional interface
public class Pentagon extends Shape implements TwoDimensional{

    private double length;//length of one side of the pentagon

    //constructor for the pentagon class
    public Pentagon(String color,double length) {
        super(color);
        this.length = length;
    }

    //getter to get pentagon length
    public double getLength() {
        return length;
    }

    //overrides the area method in TwoDimensional interface
    @Override
    public double area() {
        return (1/4) * Math.sqrt(5*(5+2*Math.sqrt(5))*(length*2));
    }

    //overrides the perimeter method in TwoDimensional interface
    @Override
    public double perimeter() {
        return (length*5);
    }

    @Override
    //overrides toString from class Shape
    public String toString() {
        return super.toString() +" ,length:"+getLength();
    }
}
