package patronvisitante3;

public class Cigarro {

    private double precio;

    Cigarro(double precio) {

        this.precio = precio;

    }

    public double accept(Visitor visitor) {

        return visitor.visit(this);

    }

    public double getPrecio() {

        return this.precio;

    }
}
