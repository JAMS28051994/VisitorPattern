package patronvisitante3;

public class PatronVisitanteImpuestos {

    public static void main(String[] args) {
        Impuesto1 impuesto1 = new Impuesto1();

        Impuesto2 impuesto2 = new Impuesto2();

        Leche leche = new Leche(3.47);

        Licor licor = new Licor(11.99);

        Cigarro cigarro = new Cigarro(19.99);
        
          System.out.println("IMPUESTO 1 PRECIOS\n");

        System.out.println(leche.accept(impuesto1) + "\n");

        System.out.println(licor.accept(impuesto1) + "\n");

        System.out.println(cigarro.accept(impuesto1) + "\n");

        System.out.println("IMPUESTO 2 PRECIOS\n");

        System.out.println(leche.accept(impuesto2) + "\n");

        System.out.println(licor.accept(impuesto2) + "\n");

        System.out.println(cigarro.accept(impuesto2) + "\n");
    }
}
