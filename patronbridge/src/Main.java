// Clase principal para probar el patrón Bridge
public class Main {
    public static void main(String[] args) {
        // Crear un rectángulo con color negro y dibujarlo
        Shape rectangle = new Rectangle(new BlackColor());
        rectangle.draw();

        // Crear un triángulo con color verde y dibujarlo
        Shape triangle = new Triangle(new GreenColor());
        triangle.draw();

        // Crear un rectángulo con color rojo y dibujarlo
        Shape redRectangle = new Rectangle(new RedColor());
        redRectangle.draw();

        // Crear un triángulo con color rode y dibujarlo
        Shape rodeTriangle = new Triangle(new RodeColor());
        rodeTriangle.draw();
    }
}