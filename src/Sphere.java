//Sphere class inherits from the Shape class  and implements methods from ThreeDimensional interface
public class Sphere extends Shape implements ThreeDimensional{
    private double sphereRadius;

    //constructor  for the sphere class
    public Sphere(String color,double radius) {
        super(color);
        this.sphereRadius =radius;
    }

    //getter to get radius of the sphere
    public double getSphereRadius() {
        return sphereRadius;
    }

    //overrides the volume method from the ThreeDimension interface
    @Override
    public double volume() {
        return (4 / 3) * Math.PI * sphereRadius * sphereRadius * sphereRadius;
    }

    //overrides the toString method from class Shape
    @Override
    public String toString() {
        return super.toString() +" ,sphereRadius:"+getSphereRadius();
    }
}
