package visitorPattern;

public class FurnitureVisitor implements Visitor{
    private double shippingCost;

    public FurnitureVisitor(){

    }

    @Override
    public double visit(Sofa sofa) {
        System.out.print("Sofa Item Shipping Cost with distance calculation: ");
        return shippingCost += sofa.getDistance() * 0.5;
    }

    @Override
    public double visit(Table table) {
        System.out.print("Table Item Shipping Cost with weight calculation: ");
        return shippingCost += table.getWeight() * 1.5;
    }

    @Override
    public double visit(Chair chair) {
        System.out.print("Chair Item Shipping Cost: ");
        return shippingCost +=10;
    }

    public double getShippingCost() {
        return shippingCost;
    }
}
