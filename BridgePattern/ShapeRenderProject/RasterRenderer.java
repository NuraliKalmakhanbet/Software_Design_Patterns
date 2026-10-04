public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle of radius " + radius + " as pixels.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square of side " + side + " as pixels.");
    }
}