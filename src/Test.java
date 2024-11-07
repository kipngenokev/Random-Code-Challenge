import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("yellow",14));
        shapes.add(new Pentagon("blue",7));
        shapes.add(new Dodecahedron("black",10));
        shapes.add(new Sphere("red",21));
        printShapeInfo(shapes);//calling method to print shape information
        printTwoDimensionBlueShapes(shapes);//calling method to print two dimensional shapes that are blue
        printLargestThreeDimensional(shapes);//calling method to print largest three dimensional shape
    }
    //printing all the information of the shapes using toString
    public static void printShapeInfo(ArrayList<Shape> shapes) {
        for(Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    //printing area the name and area of all 2-dimensional shapes that are blue in color
    public static void printTwoDimensionBlueShapes(ArrayList<Shape> shapes) {
        for(Shape shape : shapes) {
            if(shape.getColor().equalsIgnoreCase("blue") //using  ignore case to make the code run
                    && shape instanceof TwoDimensional) {//to only make this be specifically for the TwoDimensional shapes
                TwoDimensional twoDShape = (TwoDimensional) shape;
                System.out.printf("Shape: %s, Area: %.2f%n", shape.getClass().getSimpleName(), twoDShape.area());
            }
        }
    }

    public static void printLargestThreeDimensional(ArrayList<Shape> shapes) {//method to print largest ThreeDimensionalShapes
        ThreeDimensional largestShape = null;
        double largestVolume = 0;

        for (Shape shape : shapes) {
            if (shape instanceof ThreeDimensional) {//to make only the ThreeDimensional shapes be printed
                ThreeDimensional threeDShape = (ThreeDimensional) shape;
                double volume = threeDShape.volume();

                if (largestShape == null || volume > largestVolume) {
                    largestShape = threeDShape;
                    largestVolume = volume;
                }
            }
        }

        if (largestShape != null) {
            System.out.printf("Shape: %s, Color: %s, Largest Volume: %.2f%n",
                    ((Shape) largestShape).getClass().getSimpleName(),
                    ((Shape) largestShape).getColor(),
                    largestVolume);
        } else {
            System.out.println("No three-dimensional shapes found in the list.");
        }
    }
}
