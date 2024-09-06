// Clase concreta que extiende Shape y representa un triángulo
public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    // Implementación del método draw que dibuja un triángulo y llena con el color especificado
    @Override
    public void draw() {
        System.out.println("Drawing triangle");
        color.fillColor();
    }
}