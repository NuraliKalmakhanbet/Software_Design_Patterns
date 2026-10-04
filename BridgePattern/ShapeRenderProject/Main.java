public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0);
        Shape square = new Square(vectorRenderer, 10.0);

        circle.draw();
        square.draw();

        System.out.println("--- Switching implementations at runtime ---");

        Shape rasterCircle = new Circle(rasterRenderer, 5.0);
        Shape rasterSquare = new Square(rasterRenderer, 10.0);

        rasterCircle.draw();
        rasterSquare.draw();
    }
}