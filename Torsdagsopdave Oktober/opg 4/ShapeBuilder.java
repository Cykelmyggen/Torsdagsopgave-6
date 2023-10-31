import java.util.ArrayList;

public class ShapeBuilder {
    private final ArrayList<Shape> shapes;

    public ShapeBuilder() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
