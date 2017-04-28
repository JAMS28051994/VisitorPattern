package patronvisitante3;

public class Impuesto1 implements Visitor {

    public Impuesto1() {

    }

    @Override
    public double visit(Licor licorItem) {

        System.out.println("Licor: Precio con impuesto1");
        return ((licorItem.getPrecio() * .18) + licorItem.getPrecio());

    }

    @Override
    public double visit(Cigarro cigarroItem) {

        System.out.println("Cigarro: Precio con impuesto1");

        return (cigarroItem.getPrecio() * .32) + cigarroItem.getPrecio();

    }

    @Override
    public double visit(Leche lecheItem) {

        System.out.println("Leche: Precio con impuesto1");

        return (lecheItem.getPrecio() * .21) + lecheItem.getPrecio();

    }
}
