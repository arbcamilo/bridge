// Clase abstracta que representa una forma y contiene una referencia a un objeto Color
public abstract class Shape {
    protected Color color;

    // Constructor que inicializa el color de la forma
    public Shape(Color color) {
        this.color = color;
    }

    // Método abstracto que debe ser implementado por las clases concretas
    public abstract void draw();
}