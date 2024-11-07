//abstract class shape
public abstract class Shape {
    private String color;

    //constructor for the shape class
    public Shape(String color) {
        this.color = color;
    }

    //getter method to get colour
    public String getColor() {
        return color;
    }

    //overriding  toString from java.lang
    @Override
    public String toString() {
        return "Shape: " + getClass().getSimpleName() + ", Color: " + color;
    }
}
