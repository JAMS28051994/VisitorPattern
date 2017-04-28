package patronvisitante3;

public interface Visitor {

    public double visit(Licor liquorItem);

    public double visit(Cigarro tobaccoItem);

    public double visit(Leche necessityItem);
}
