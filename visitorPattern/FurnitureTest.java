package visitorPattern;

import tests.visitor.*;

public class FurnitureTest {
    public static void main(String[] args) {
        FurnitureVisitor furnitureVisitor = new FurnitureVisitor();

        Chair chair = new Chair();
        Table table = new Table(20);
        Sofa sofa = new Sofa(100);

        System.out.println("SHIPPING COST PER FURNITURE TYPE");
        System.out.println(chair.accept(furnitureVisitor));
        System.out.println(sofa.accept(furnitureVisitor));
        System.out.println(table.accept(furnitureVisitor));

    }

}

