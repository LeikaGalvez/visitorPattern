package visitorPattern;

public class Chair implements Furniture{

    @Override
    public double accept(FurnitureVisitor furnitureVisitor) {
        return furnitureVisitor.visit(this);
    }
}
