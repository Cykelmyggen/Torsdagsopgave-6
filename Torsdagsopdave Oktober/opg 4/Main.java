public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Square Area: " + square.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println("Total Area: " + shapeBuilder.getTotalArea());
    }
}
