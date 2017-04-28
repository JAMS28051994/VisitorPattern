package patronvisitante3;

public class Licor {

    private double precio;

    Licor(double precio) {

        this.precio = precio;

    }

    public double accept(Visitor visitor) {

        return visitor.visit(this);

    }

    public double getPrecio() {

        return this.precio;

    }
}
