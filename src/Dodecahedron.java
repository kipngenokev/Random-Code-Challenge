//this class inherits from the Shape class and implements methods from the ThreeDimensional interface
public class Dodecahedron extends Shape implements ThreeDimensional{
    private double edge;//variable to store the radius of the dodecahedron
    public Dodecahedron(String color,double dRadius) {
        super(color);
        this.edge = edge;
    }
    //setter for the dodecahedron edge
    public void setEdge(double edge) {
        this.edge =edge;
    }
    //getter for the radius of the dodecahedron
    public double getEdge() {
        return edge;
    }

    //overrides the volume method from ThreeDimensional interface
    @Override
    public double volume() {
        return ((15+7*Math.sqrt(5))/4)*(edge*edge);
    }

    //overrides the toString method from ths Shape class
    @Override
    public String toString() {
        return super.toString()+" ,edge:"+getEdge();
    }
}
