public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle of radius " + radius + " as vector lines.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square of side " + side + " as vector lines.");
    }
}