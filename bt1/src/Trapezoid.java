public class Trapezoid {
    public double bottomEdge;
    public double topEdge;
    public double height;
    public double side1;
    public double side2;
    public Trapezoid(double bottomEdge, double topEdge, double height, double side1, double side2) {
        this.bottomEdge = bottomEdge;
        this .topEdge = topEdge;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return ((topEdge + bottomEdge)*height/2);
    }

    public double getPerimeter() {
        return (topEdge + bottomEdge + side1 + side2);

    }
}
