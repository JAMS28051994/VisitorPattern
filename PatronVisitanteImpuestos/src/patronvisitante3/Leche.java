package patronvisitante3;

public class Leche {

    private double precio;

    Leche(double precio) {

        this.precio = precio;

    }

    public double accept(Visitor visitor) {

        return visitor.visit(this);

    }

    public double getPrecio() {

        return this.precio;

    }
}
