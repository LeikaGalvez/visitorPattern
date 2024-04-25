# Problem Statement
You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size.

Each furniture type might have its own unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty adding new furniture types in the future.

Implement a visitor design pattern approach. You must show the different elements of visitor design in your solution.  DO NOT USE ABSTRACT CLASSES. You are free to name your interfaces and concrete classes. Have a client code that will test your program.

##### Client Class:
```
package visitorPattern;

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
```
#
# Output
![image](https://github.com/LeikaGalvez/visitorPattern/assets/142652629/1742ae51-7649-4a91-9cbe-8cec3c677870)
#
# UML Diagram
TBA


