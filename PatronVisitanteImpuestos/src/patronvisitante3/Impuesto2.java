package patronvisitante3;

public class Impuesto2 implements Visitor {

    public Impuesto2() {

    }

    @Override
    public double visit(Licor licorItem) {

        System.out.println("Licor: Precio con impuesto2");
        return (licorItem.getPrecio() * .10) + licorItem.getPrecio();

    }

    @Override
    public double visit(Cigarro cigarroItem) {

        System.out.println("Cigarro: Precio con impuesto2");

        return (cigarroItem.getPrecio() * .30) + cigarroItem.getPrecio();

    }

    @Override
    public double visit(Leche lecheItem) {

        System.out.println("Leche: Precio con impuesto2");

        return (lecheItem.getPrecio()) + lecheItem.getPrecio();

    }
}
