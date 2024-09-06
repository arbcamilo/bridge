// Clase concreta que extiende Shape y representa un rectángulo
public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    // Implementación del método draw que dibuja un rectángulo y llena con el color especificado
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        color.fillColor();
    }
}