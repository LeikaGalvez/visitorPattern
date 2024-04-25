package visitorPattern;

public interface Visitor {
    public double visit(Sofa sofa);
    public double visit(Table table);
    public double visit(Chair chair);
}
